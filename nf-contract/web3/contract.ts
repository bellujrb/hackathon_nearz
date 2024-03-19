import Web3 from "web3";
import { AbiItem } from "web3-utils";
import { ABI } from "./abi";

const web3 = new Web3("http://localhost:8545");

const contractABI: AbiItem[] = ABI

const contractAddress = "0x...";

const account = "0x..."; 
const privateKey = "0x..."; 

const contract = new web3.eth.Contract(contractABI, contractAddress);

async function getInvoice() {
  try {
    const result = await contract.methods.getInvoice().call();
    console.log("Invoice:", result);
  } catch (error) {
    console.error("Erro ao buscar o invoice:", error);
  }
}

async function setInvoice(params: any[]) {
  try {
    const encodedABI = contract.methods.setInvoice(...params).encodeABI();
    const tx = {
      from: account,
      to: contractAddress,
      gas: 2000000,
      data: encodedABI,
    };
    const signedTx = await web3.eth.accounts.signTransaction(tx, privateKey);
    const receipt = await web3.eth.sendSignedTransaction(
      signedTx.rawTransaction || ""
    );
    console.log("Recibo da transação:", receipt);
  } catch (error) {
    console.error("Erro ao enviar a transação:", error);
  }
}

getInvoice();
