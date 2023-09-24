package com.BBCorporation.UtilityBillOps.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {

	@Id
	private int id;

	@ManyToOne
	@JoinColumn(name = "customerid_fk")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name = "invoiceid_fk")
	private Invoice invoice;

	private Date date;
	private double amount;
	private String paymentMethod;
	private String paymentStatus;
	private long referenceNo;

	public Transaction() {

	}

	public Transaction(int id, Customer customer, Date date, double amount, String paymentMethod, String paymentStatus,
			long referenceNo) {
		super();
		this.id = id;
		this.customer = customer;
		this.date = date;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.paymentStatus = paymentStatus;
		this.referenceNo = referenceNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public long getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(long referenceNo) {
		this.referenceNo = referenceNo;
	}

	@Override
	public String toString() {
		return "Transaction [id=" + id + ", customer=" + customer + ", date=" + date + ", amount=" + amount
				+ ", paymentMethod=" + paymentMethod + ", paymentStatus=" + paymentStatus + ", referenceNo="
				+ referenceNo + "]";
	}

}