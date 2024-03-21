// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

contract Invoice {
    struct InvoiceData {
        address payable payer;
        address payable payee;
        uint256 invoiceNumber;
        string invoiceDate;
        string[] itemDescriptions;
        uint256[] quantities;
        uint256[] unitPrices;
        uint256 total;
        uint256 tax;
        uint256 paymentDocumentNumber;
    }

    InvoiceData[] public invoices;

    function setInvoiceData(
        address payable _payer,
        address payable _payee,
        uint256 _invoiceNumber,
        string memory _invoiceDate,
        string[] memory _itemDescriptions,
        uint256[] memory _quantities,
        uint256[] memory _unitPrices,
        uint256 _total,
        uint256 _tax,
        uint256 _paymentDocumentNumber
    ) public {
        require(
            _itemDescriptions.length == _quantities.length &&
                _quantities.length == _unitPrices.length,
            "Array lengths must match"
        );

        invoices.push(
            InvoiceData({
                payer: _payer,
                payee: _payee,
                invoiceNumber: _invoiceNumber,
                invoiceDate: _invoiceDate,
                itemDescriptions: _itemDescriptions,
                quantities: _quantities,
                unitPrices: _unitPrices,
                total: _total,
                tax: _tax,
                paymentDocumentNumber: _paymentDocumentNumber
            })
        );
    }

    function getInvoice(
        uint256 index
    )
        public
        view
        returns (
            address payable,
            address payable,
            uint256,
            string memory,
            string[] memory,
            uint256[] memory,
            uint256[] memory,
            uint256,
            uint256,
            uint256
        )
    {
        require(index < invoices.length, "Index out of bounds");

        InvoiceData memory invoice = invoices[index];
        return (
            invoice.payer,
            invoice.payee,
            invoice.invoiceNumber,
            invoice.invoiceDate,
            invoice.itemDescriptions,
            invoice.quantities,
            invoice.unitPrices,
            invoice.total,
            invoice.tax,
            invoice.paymentDocumentNumber
        );
    }

    function getAllInvoices() public view returns (InvoiceData[] memory) {
        return invoices;
    }

    function checkInvoice(
        address payer,
        address payee
    ) public pure returns (string memory) {
        string memory message = "";

        if (payer == payee) {
            message = "It cannot be the buyer and the seller";
            return message;
        }
        if (payer == address(0)) {
            message = "Need a Buyer";
            return message;
        }

        if (payee == address(0)) {
            message = "Need a Seller";
            return message;
        }

        message = "Verify";
        return message;
    }
}
