package com.BBCorporation.UtilityBillOps.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BBCorporation.UtilityBillOps.dao.CustomerDao;
import com.BBCorporation.UtilityBillOps.dao.InvoiceDao;
import com.BBCorporation.UtilityBillOps.entity.Customer;
import com.BBCorporation.UtilityBillOps.entity.Invoice;

@Service
public class InvoiceService {

	@Autowired
	InvoiceDao invoicedao;

	@Autowired
	CustomerService customerservice;

	public String generateInvoice(int customerID) {

		Customer customer = customerservice.getSpecificCustomerbyID(customerID);

		Invoice invoice = new Invoice();

		// Calculate the amount due based on unit consumption and rate
		double unitRate = 41.50;
		double totalAmount = 0;
		double amount = customer.getUnitConsumption() * unitRate;

		// Apply discounts online payment if applicable
		if (invoice.isCash()) {
			totalAmount = amount;
			invoice.setCash(true);

		} else {
			totalAmount = amount - (0.05 * amount); // 5% online payment discount
		}

		java.util.Date currentDate = new java.util.Date();

		// Apply discounts on before due date if applicable
		if (customer.getBillDueDate().before(currentDate)) {
			System.out.println("The due date has passed.");
			totalAmount = amount;

		} else {
			System.out.println("The due date is in the future.");
			totalAmount = amount - (0.05 * amount); // 5% early payment discount
		}
		double amountDue = 0;
		amountDue = amountDue + totalAmount;
		invoice.setAmountDue(amountDue);
		invoice.setTotalAmount(totalAmount);
		invoice.setCustomer(customer);

		invoicedao.generateInvoice(invoice);
		return "Invoice generated Successfully";
	}

	public List<Invoice> getAllInvoice() {
		return invoicedao.getAllInvoice();
	}

	public Invoice getInvoiceofSpecificCustomer(int customerID) {
		return invoicedao.getInvoiceofSpecificCustomer(customerID);
	}

}
