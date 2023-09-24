package com.BBCorporation.UtilityBillOps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.BBCorporation.UtilityBillOps.entity.Transaction;
import com.BBCorporation.UtilityBillOps.service.TransactionService;

public class TransactionController {

	@Autowired
	TransactionService transactionservice;

	/**
	 * @author Sakshi Mourya POST endpoint to maintain transaction.
	 * 
	 * @param The customer ID provided in the request body.
	 * 
	 * @return The result of the generating transaction for specific customer.
	 */
	@PostMapping("maintainTransation/{customerID}")
	public ResponseEntity<Object> maintainTransation(@PathVariable int customerID, @PathVariable String paymentMethod) {
		return (ResponseEntity.ok(transactionservice.maintainTransation(customerID, paymentMethod)));
	}

	/**
	 * @author Sakshi Mourya GET endpoint to get the transaction of all customer.
	 * 
	 * @return The result to get a List of all transaction of customer.
	 */

	@GetMapping("getAllTransaction")
	public List<Transaction> getAllTransaction() {
		return transactionservice.getAllTransaction();
	}

	/**
	 * @author Sakshi Mourya GET endpoint to get transaction of specific customer.
	 * 
	 * @param The customer ID provided in the request body.
	 * 
	 * @return The result of the getting transaction for specific customer.
	 */

	@GetMapping("getTransactionbyCustomerID/{customerID}")
	public ResponseEntity<Object> getTransactionbyCustomerID(@PathVariable int customerID) {
		return (ResponseEntity.ok(transactionservice.getTransactionbyCustomerID(customerID)));
	}

	/**
	 * @author Sakshi Mourya DELETE endpoint to delete a customer transaction.
	 * 
	 * @param The customer ID is provided in the path variable.
	 * 
	 * @return The result to delete a transaction of specific customer.
	 */

	@DeleteMapping("deleteCustomerTransaction/{id}")
	public String deleteCustomerTransaction(@PathVariable int id) {
		return transactionservice.deleteCustomerTransaction(id);
	}

	/**
	 * @author Sakshi Mourya GET endpoint to get all payment of all customer.
	 * 
	 * @return The result to get a List of all payment of customer.
	 */
	@GetMapping("getAllPayment")
	public List<Transaction> getAllPayment() {
		return transactionservice.getAllPayment();
	}

	/**
	 * @author Sakshi Mourya GET endpoint to get payment of specific customer.
	 * 
	 * @param The customer ID provided in the request body.
	 * 
	 * @return The result of the getting payment for specific customer.
	 */

	@GetMapping("getPaymentofSpecificCustomer/{customerID}")
	public ResponseEntity<Object> getPaymentofSpecificCustomer(@PathVariable int customerID) {
		return (ResponseEntity.ok(transactionservice.getPaymentofSpecificCustomer(customerID)));
	}

	/**
	 * @author Sakshi Mourya PUT endpoint to update statusof payment for specific
	 *         customer.
	 * 
	 * @param The customer ID provided in the request body.
	 * 
	 * @return The result of the changing a status of payment for specific customer.
	 */

	@PutMapping("makePayment/{customerID,paymentMethod}")
	public ResponseEntity<Object> makePayment(@PathVariable int customerID) {
		return (ResponseEntity.ok(transactionservice.makePayment(customerID)));
	}

}
