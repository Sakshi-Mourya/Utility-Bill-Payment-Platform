package com.BBCorporation.UtilityBillOps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BBCorporation.UtilityBillOps.dao.EmployeeDao;
import com.BBCorporation.UtilityBillOps.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao empdao;

	public Object loginEmployee(int employeeID, int otp) {

		Employee emp = empdao.loginEmployee(employeeID);

		int empotp = emp.getOtp();

		if (emp != null && (empotp == otp)) {
			return "Login SuccessFull !!...";
		}

		return "Login Failed !!...";

	}

}
