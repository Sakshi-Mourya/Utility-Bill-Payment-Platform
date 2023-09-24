package com.BBCorporation.UtilityBillOps.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int InvoiceID;

	@ManyToOne
	@JoinColumn(name = "customerid_fk")
	private Customer customer;

	private double amountDue;
	private double totalAmount;
	private boolean isCash;

	public Invoice() {

	}

	public Invoice(int invoiceID, Customer customer, double amountDue, double totalAmount, boolean isCash) {
		super();
		this.InvoiceID = invoiceID;
		this.customer = customer;
		this.amountDue = amountDue;
		this.totalAmount = totalAmount;
		this.isCash = isCash;
	}

	public int getInvoiceID() {
		return InvoiceID;
	}

	public void setInvoiceID(int invoiceID) {
		InvoiceID = invoiceID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public double getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean isCash() {
		return isCash;
	}

	public void setCash(boolean isCash) {
		this.isCash = isCash;
	}

	@Override
	public String toString() {
		return "Invoice [InvoiceID=" + InvoiceID + ", customer=" + customer + ", amountDue=" + amountDue
				+ ", totalAmount=" + totalAmount + ", isCash=" + isCash + "]";
	}

}