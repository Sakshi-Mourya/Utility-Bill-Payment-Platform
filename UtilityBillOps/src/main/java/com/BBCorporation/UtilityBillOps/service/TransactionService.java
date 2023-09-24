package com.BBCorporation.UtilityBillOps.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.BBCorporation.UtilityBillOps.dao.TransactionDao;
import com.BBCorporation.UtilityBillOps.entity.Customer;
import com.BBCorporation.UtilityBillOps.entity.Invoice;
import com.BBCorporation.UtilityBillOps.entity.Transaction;

@Service
public class TransactionService {

	@Autowired
	TransactionDao transactiondao;

	@Autowired
	CustomerService customerservice;

	public List<Transaction> getAllTransaction() {
		return transactiondao.getAllTransaction();
	}

	public Transaction getTransactionbyCustomerID(int customerID) {
		return transactiondao.getTransactionbyCustomerID(customerID);
	}

	public String deleteCustomerTransaction(int id) {
		return transactiondao.deleteCustomerTransaction(id);
	}

	public List<Transaction> getAllPayment() {
		return transactiondao.getAllPayment();
	}

	public Transaction getPaymentofSpecificCustomer(int customerID) {
		return transactiondao.getPaymentofSpecificCustomer(customerID);
	}

	public String makePayment(int customerID) {

		Customer customer = customerservice.getSpecificCustomerbyID(customerID);

		Transaction payment = new Transaction();

		if (customer == null) {
			System.out.println("Customer with " + customerID + " not Found");
		} else {
			payment.setPaymentStatus("success");
			payment.setDate((java.sql.Date) new Date());

		}
		transactiondao.makePayment(payment);
		return "Payment Done SuccessFully!!!";
	}

	public Object maintainTransation(int customerID, String paymentMethod) {

		Customer customer = customerservice.getSpecificCustomerbyID(customerID);

		Transaction maintaintransation = new Transaction();
		Invoice invoice = new Invoice();

		if (customer == null) {
			System.out.println("Customer with " + customerID + " not Found");
		} else {
			maintaintransation.setDate((java.sql.Date) new Date());
			maintaintransation.setAmount(invoice.getTotalAmount());
			maintaintransation.setPaymentMethod(paymentMethod);

		}
		transactiondao.makeTransation(maintaintransation);
		return "Transaction  Done SuccessFully!!!";

	}

}
