package com.BBCorporation.UtilityBillOps.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int employeeID;
	private int otp;
	
	public Employee() {
		
	}

	public Employee(int employeeID, int otp) {
		super();
		this.employeeID = employeeID;
		this.otp = otp;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", otp=" + otp + "]";
	}
	
}