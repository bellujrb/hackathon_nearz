export const ABI = [
  {
    type: "constructor",
    inputs: [
      { name: "_payer", type: "address", internalType: "address payable" },
      { name: "_payee", type: "address", internalType: "address payable" },
      { name: "_invoiceNumber", type: "uint256", internalType: "uint256" },
      { name: "_invoiceDate", type: "string", internalType: "string" },
      {
        name: "_itemDescriptions",
        type: "string[]",
        internalType: "string[]",
      },
      { name: "_quantities", type: "uint256[]", internalType: "uint256[]" },
      { name: "_unitPrices", type: "uint256[]", internalType: "uint256[]" },
      { name: "_total", type: "uint256", internalType: "uint256" },
      { name: "_tax", type: "uint256", internalType: "uint256" },
      {
        name: "_paymentDocumentNumber",
        type: "uint256",
        internalType: "uint256",
      },
    ],
    stateMutability: "nonpayable",
  },
  {
    type: "function",
    name: "checkInvoice",
    inputs: [],
    outputs: [{ name: "", type: "string", internalType: "string" }],
    stateMutability: "view",
  },
  {
    type: "function",
    name: "getInvoice",
    inputs: [],
    outputs: [
      { name: "", type: "address", internalType: "address payable" },
      { name: "", type: "address", internalType: "address payable" },
      { name: "", type: "uint256", internalType: "uint256" },
      { name: "", type: "string", internalType: "string" },
      { name: "", type: "string[]", internalType: "string[]" },
      { name: "", type: "uint256[]", internalType: "uint256[]" },
      { name: "", type: "uint256[]", internalType: "uint256[]" },
      { name: "", type: "uint256", internalType: "uint256" },
      { name: "", type: "uint256", internalType: "uint256" },
      { name: "", type: "uint256", internalType: "uint256" },
    ],
    stateMutability: "view",
  },
  {
    type: "function",
    name: "invoice",
    inputs: [],
    outputs: [
      { name: "payer", type: "address", internalType: "address payable" },
      { name: "payee", type: "address", internalType: "address payable" },
      { name: "invoiceNumber", type: "uint256", internalType: "uint256" },
      { name: "invoiceDate", type: "string", internalType: "string" },
      { name: "total", type: "uint256", internalType: "uint256" },
      { name: "tax", type: "uint256", internalType: "uint256" },
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
    name: "setInvoice",
    inputs: [
      { name: "_payer", type: "address", internalType: "address payable" },
      { name: "_payee", type: "address", internalType: "address payable" },
      { name: "_invoiceNumber", type: "uint256", internalType: "uint256" },
      { name: "_invoiceDate", type: "string", internalType: "string" },
      {
        name: "_itemDescriptions",
        type: "string[]",
        internalType: "string[]",
      },
      { name: "_quantities", type: "uint256[]", internalType: "uint256[]" },
      { name: "_unitPrices", type: "uint256[]", internalType: "uint256[]" },
      { name: "_total", type: "uint256", internalType: "uint256" },
      { name: "_tax", type: "uint256", internalType: "uint256" },
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