package com.BBCorporation.UtilityBillOps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BBCorporation.UtilityBillOps.entity.Invoice;
import com.BBCorporation.UtilityBillOps.service.InvoiceService;

@RestController
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceservice;

	/**
	 * @author Sakshi Mourya POST endpoint to generate Invoice.
	 * 
	 * @param The customer ID provided in the request body.
	 * 
	 * @return The result of the generating invoice for specific customer.
	 */
	
	@PostMapping("generateInvoice/{customerID}")
	public ResponseEntity<Object> generateInvoice(@PathVariable int customerID) { 
		return (ResponseEntity.ok(invoiceservice.generateInvoice(customerID)));
	}
	
	/**@author Sakshi Mourya
	 * GET endpoint to get the invoice of all customer.
	 * 
	 * @return The result to get a List of all invoice of customer.
	 */
	
	@GetMapping("getAllInvoice")
	public List<Invoice> getAllInvoice() {
		return invoiceservice.getAllInvoice();
	}
	/**@author Sakshi Mourya
	 * GET endpoint to get the invoice of specific customer.
	 * 
	 * @param  The customer ID is provided in the path variable.
	 * 
	 * @return The result to get a invoice of specific customer.
	 */
	
	@GetMapping("getInvoiceofSpecificCustomer/{customerID}")
	public  ResponseEntity<Object> getInvoiceofSpecificCustomer(@PathVariable int customerID) {
		return (ResponseEntity.ok(invoiceservice.getInvoiceofSpecificCustomer(customerID)));
	}

}
