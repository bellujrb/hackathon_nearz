// SPDX-License-Identifier: UNLICENSED
pragma solidity ^0.8.13;

import {Test, console} from "forge-std/Test.sol";
import {Invoice} from "../src/Invoice.sol";

contract InvoiceTest is Test {
    Invoice public invoice;

    function setUp() public {
        invoice = new Invoice();
        address payable payer = payable(address(0x1));
        address payable payee = payable(address(0x2));
        uint256 invoiceNumber = 123;
        string memory invoiceDate = "2024-03-16";
        string[] memory itemDescriptions = new string[](2);
        itemDescriptions[0] = "Item 1";
        itemDescriptions[1] = "Item 2";
        uint256[] memory quantities = new uint256[](2);
        quantities[0] = 1;
        quantities[1] = 2;
        uint256[] memory unitPrices = new uint256[](2);
        unitPrices[0] = 100;
        unitPrices[1] = 200;
        uint256 total = 500;
        uint256 tax = 50;
        uint256 paymentDocumentNumber = 67890;

        invoice.setInvoiceData(
            payer,
            payee,
            invoiceNumber,
            invoiceDate,
            itemDescriptions,
            quantities,
            unitPrices,
            total,
            tax,
            paymentDocumentNumber
        );
    }

    function test_GetInvoice() public {
        (
            address payable returnedPayer,
            address payable returnedPayee,
            uint256 returnedInvoiceNumber,
            string memory returnedInvoiceDate,
            string[] memory returnedItemDescriptions,
            uint256[] memory returnedQuantities,
            uint256[] memory returnedUnitPrices,
            uint256 returnedTotal,
            uint256 returnedTax,
            uint256 returnedPaymentDocumentNumber
        ) = invoice.getInvoice(0);

        assertEq(returnedPayer, payable(address(0x1)));
        assertEq(returnedPayee, payable(address(0x2)));
        assertEq(returnedInvoiceNumber, 123);
        assertEq(returnedInvoiceDate, "2024-03-16");
        assertEq(returnedItemDescriptions[0], "Item 1");
        assertEq(returnedItemDescriptions[1], "Item 2");
        assertEq(returnedQuantities[0], 1);
        assertEq(returnedQuantities[1], 2);
        assertEq(returnedUnitPrices[0], 100);
        assertEq(returnedUnitPrices[1], 200);
        assertEq(returnedTotal, 500);
        assertEq(returnedTax, 50);
        assertEq(returnedPaymentDocumentNumber, 67890);
    }

    function test_CheckInvoice() public {
        assertEq(
            invoice.checkInvoice(address(0x1), address(0x1)),
            "It cannot be the buyer and the seller",
            "Incorrect message for same payer and payee"
        );

        assertEq(
            invoice.checkInvoice(address(0), address(0x2)),
            "Need a Buyer",
            "Incorrect message for missing buyer"
        );

        assertEq(
            invoice.checkInvoice(address(0x1), address(0)),
            "Need a Seller",
            "Incorrect message for missing seller"
        );

        assertEq(
            invoice.checkInvoice(address(0x1), address(0x2)),
            "Verify",
            "Incorrect message for valid invoice"
        );
    }
}
