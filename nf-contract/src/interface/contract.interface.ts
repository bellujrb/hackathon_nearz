export interface InvoiceData {
    payer: string;
    payee: string;
    invoiceNumber: number;
    invoiceDate: string;
    itemDescriptions: string[];
    quantities: number[];
    unitPrices: number[];
    total: number;
    tax: number;
    paymentDocumentNumber: number;
}