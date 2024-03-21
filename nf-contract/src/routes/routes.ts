import express from "express";
import multer from "multer";
import {
  setInvoiceData,
  getInvoice,
  getAllInvoices,
  checkInvoice,
} from "../web3/contract";

export const router = express.Router();

router.post("/invoice", async (req, res) => {
  try {
    const {
      payer,
      payee,
      invoiceNumber,
      invoiceDate,
      itemDescriptions,
      quantities,
      unitPrices,
      total,
      tax,
      paymentDocumentNumber,
    } = req.body;
    const invoiceData = {
      payer,
      payee,
      invoiceNumber,
      invoiceDate,
      itemDescriptions,
      quantities,
      unitPrices,
      total,
      tax,
      paymentDocumentNumber,
    };
    const messageRes = await checkInvoice(invoiceData.payer, invoiceData.payee);
    if (messageRes == "Verify") {
      await setInvoiceData(invoiceData);
      res.status(200).send({ message: "Invoice created successfully" });
    } else {
      res.status(500).send({ message: messageRes });
    }
  } catch (error) {
    res.status(500).send({ error: error });
  }
});

router.get("/invoice", async (req, res) => {
  try {
    const response = req.body;
    let invoice = await getInvoice(response.index);
    if (invoice) {
      const invoicesWithoutBigInts = invoice.map((invoice) => {
        return {
          payer: String(invoice.payer),
          payee: String(invoice.payee),
          invoiceNumber: Number(invoice.invoiceNumber),
          invoiceDate: invoice.invoiceDate,
          itemDescriptions: invoice.itemDescriptions,
          quantities: invoice.quantities.map((qty) => Number(qty)),
          unitPrices: invoice.unitPrices.map((price) => Number(price)),
          total: Number(invoice.total),
          tax: Number(invoice.tax),
          paymentDocumentNumber: Number(invoice.paymentDocumentNumber),
        };
      });
      res.status(200).json({ status: 200, data: invoicesWithoutBigInts });
    } else {
      res.status(404).json({ status: 404, data: "Don't Found" });
    }
  } catch (error) {
    res.status(500).send(error);
  }
});

router.get("/all-invoices", async (req, res) => {
  try {
    const invoices = await getAllInvoices();
    if (invoices) {
      console.log(invoices);
      const invoicesWithoutBigInts = invoices.map((invoice) => {
        return {
          payer: String(invoice.payer),
          payee: String(invoice.payee),
          invoiceNumber: Number(invoice.invoiceNumber),
          invoiceDate: invoice.invoiceDate,
          itemDescriptions: invoice.itemDescriptions,
          quantities: invoice.quantities.map((qty) => Number(qty)),
          unitPrices: invoice.unitPrices.map((price) => Number(price)),
          total: Number(invoice.total),
          tax: Number(invoice.tax),
          paymentDocumentNumber: Number(invoice.paymentDocumentNumber),
        };
      });
      res.status(200).json({ status: 200, data: invoicesWithoutBigInts });
    }
  } catch (error) {
    console.log(error);
    res.status(500).json({ status: 500, data: error });
  }
});
