export const ABI = [
  {
    type: "function",
    name: "checkInvoice",
    inputs: [
      {
        name: "payer",
        type: "address",
        internalType: "address",
      },
      {
        name: "payee",
        type: "address",
        internalType: "address",
      },
    ],
    outputs: [
      {
        name: "",
        type: "string",
        internalType: "string",
      },
    ],
    stateMutability: "pure",
  },
  {
    type: "function",
    name: "getAllInvoices",
    inputs: [],
    outputs: [
      {
        name: "",
        type: "tuple[]",
        internalType: "struct Invoice.InvoiceData[]",
        components: [
          {
            name: "payer",
            type: "address",
            internalType: "address payable",
          },
          {
            name: "payee",
            type: "address",
            internalType: "address payable",
          },
          {
            name: "invoiceNumber",
            type: "uint256",
            internalType: "uint256",
          },
          {
            name: "invoiceDate",
            type: "string",
            internalType: "string",
          },
          {
            name: "itemDescriptions",
            type: "string[]",
            internalType: "string[]",
          },
          {
            name: "quantities",
            type: "uint256[]",
            internalType: "uint256[]",
          },
          {
            name: "unitPrices",
            type: "uint256[]",
            internalType: "uint256[]",
          },
          {
            name: "total",
            type: "uint256",
            internalType: "uint256",
          },
          {
            name: "tax",
            type: "uint256",
            internalType: "uint256",
          },
          {
            name: "paymentDocumentNumber",
            type: "uint256",
            internalType: "uint256",
          },
        ],
      },
    ],
    stateMutability: "view",
  },
  {
    type: "function",
    name: "getInvoice",
    inputs: [
      {
        name: "index",
        type: "uint256",
        internalType: "uint256",
      },
    ],
    outputs: [
      {
        name: "",
        type: "address",
        internalType: "address payable",
      },
      {
        name: "",
        type: "address",
        internalType: "address payable",
      },
      {
        name: "",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "",
        type: "string",
        internalType: "string",
      },
      {
        name: "",
        type: "string[]",
        internalType: "string[]",
      },
      {
        name: "",
        type: "uint256[]",
        internalType: "uint256[]",
      },
      {
        name: "",
        type: "uint256[]",
        internalType: "uint256[]",
      },
      {
        name: "",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "",
        type: "uint256",
        internalType: "uint256",
      },
    ],
    stateMutability: "view",
  },
  {
    type: "function",
    name: "invoices",
    inputs: [
      {
        name: "",
        type: "uint256",
        internalType: "uint256",
      },
    ],
    outputs: [
      {
        name: "payer",
        type: "address",
        internalType: "address payable",
      },
      {
        name: "payee",
        type: "address",
        internalType: "address payable",
      },
      {
        name: "invoiceNumber",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "invoiceDate",
        type: "string",
        internalType: "string",
      },
      {
        name: "total",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "tax",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "paymentDocumentNumber",
        type: "uint256",
        internalType: "uint256",
      },
    ],
    stateMutability: "view",
  },
  {
    type: "function",
    name: "setInvoiceData",
    inputs: [
      {
        name: "_payer",
        type: "address",
        internalType: "address payable",
      },
      {
        name: "_payee",
        type: "address",
        internalType: "address payable",
      },
      {
        name: "_invoiceNumber",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "_invoiceDate",
        type: "string",
        internalType: "string",
      },
      {
        name: "_itemDescriptions",
        type: "string[]",
        internalType: "string[]",
      },
      {
        name: "_quantities",
        type: "uint256[]",
        internalType: "uint256[]",
      },
      {
        name: "_unitPrices",
        type: "uint256[]",
        internalType: "uint256[]",
      },
      {
        name: "_total",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "_tax",
        type: "uint256",
        internalType: "uint256",
      },
      {
        name: "_paymentDocumentNumber",
        type: "uint256",
        internalType: "uint256",
      },
    ],
    outputs: [],
    stateMutability: "nonpayable",
  },
];
