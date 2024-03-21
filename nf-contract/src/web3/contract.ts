import Web3 from "web3";
import { AbiItem } from "web3-utils";
import { ABI } from "./abi";
import { InvoiceData } from "../interface/contract.interface";
require("dotenv").config();

const contractABI: AbiItem[] = ABI;

const web3 = new Web3("http://localhost:8545");

const contractAddress = process.env.CONTRACT_ADDRESS;

const account = process.env.ACCOUNT;
const privateKey = process.env.PRIVATE_KEY;

const contract = new web3.eth.Contract(contractABI, contractAddress);

web3.eth
  .getTransactionCount(account, "latest")
  .then((nonce) => {
    console.log("Nonce da conta", account, ":", nonce);
  })
  .catch((error) => {
    console.error("Erro ao obter o nonce:", error);
  });

export async function getInvoice(index: number): Promise<InvoiceData[]> {
  try {
    const result = await contract.methods.getInvoice(index).call();
    if (result) return result;
  } catch (error) {
    console.error("Erro ao buscar o invoice:", error);
  }
}

export async function setInvoiceData(invoiceData) {
  try {
    const encodedABI = contract.methods
      .setInvoiceData(
        invoiceData.payer,
        invoiceData.payee,
        invoiceData.invoiceNumber,
        invoiceData.invoiceDate,
        invoiceData.itemDescriptions,
        invoiceData.quantities,
        invoiceData.unitPrices,
        invoiceData.total,
        invoiceData.tax,
        invoiceData.paymentDocumentNumber
      )
      .encodeABI();

    const nonce = await web3.eth.getTransactionCount(account, "pending");
    const gasPrice = await web3.eth.getGasPrice();
    const gasLimit = await contract.methods
      .setInvoiceData(
        invoiceData.payer,
        invoiceData.payee,
        invoiceData.invoiceNumber,
        invoiceData.invoiceDate,
        invoiceData.itemDescriptions,
        invoiceData.quantities,
        invoiceData.unitPrices,
        invoiceData.total,
        invoiceData.tax,
        invoiceData.paymentDocumentNumber
      )
      .estimateGas();

    const tx = {
      from: account,
      to: contractAddress,
      nonce: nonce,
      gas: gasLimit,
      gasPrice: gasPrice,
      data: encodedABI,
    };

    const signedTx = await web3.eth.accounts.signTransaction(tx, privateKey);
    const receipt = await web3.eth.sendSignedTransaction(
      signedTx.rawTransaction || ""
    );

    return receipt;
  } catch (error) {
    return error;
  }
}

export async function getAllInvoices(): Promise<InvoiceData[]> {
  try {
    const result = await contract.methods.getAllInvoices().call();
    if (result) return result;
  } catch (error) {
    console.error("Erro ao obter todos os invoices:", error);
    throw error;
  }
}

export async function checkInvoice(payee: string, payer: string) {
  try {
    const result = await contract.methods.checkInvoice(payee, payer).call();
    return result;
  } catch (error) {
    console.error("Erro ao verificar o invoice:", error);
    return error;
  }
}
