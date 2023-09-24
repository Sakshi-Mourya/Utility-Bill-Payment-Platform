package com.BBCorporation.UtilityBillOps.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	private int customerID;
	private String customerName;
	private String customerEmail;
	private String customerContact;
	private int billID;
	private double unitConsumption;
	private java.util.Date billDueDate;
	private String billDuration;

	public Customer() {

	}

	public Customer(int customerID, String customerName, String customerEmail, String customerContact, int billID,
			double unitConsumption, java.util.Date billDueDate, String billDuration) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerContact = customerContact;
		this.billID = billID;
		this.unitConsumption = unitConsumption;
		this.billDueDate = billDueDate;
		this.billDuration = billDuration;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public int getBillID() {
		return billID;
	}

	public void setBillID(int billID) {
		this.billID = billID;
	}

	public double getUnitConsumption() {
		return unitConsumption;
	}

	public void setUnitConsumption(double unitConsumption) {
		this.unitConsumption = unitConsumption;
	}

	public java.util.Date getBillDueDate() {
		return billDueDate;
	}

	public void setBillDueDate(java.util.Date billDueDate) {
		this.billDueDate = billDueDate;
	}

	public String getBillDuration() {
		return billDuration;
	}

	public void setBillDuration(String billDuration) {
		this.billDuration = billDuration;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", customerContact=" + customerContact + ", billID=" + billID + ", unitConsumption="
				+ unitConsumption + ", billDueDate=" + billDueDate + ", billDuration=" + billDuration + "]";
	}

}