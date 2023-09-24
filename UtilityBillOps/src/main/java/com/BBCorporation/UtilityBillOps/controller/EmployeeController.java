package com.BBCorporation.UtilityBillOps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;

import com.BBCorporation.UtilityBillOps.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empservice;
	
	/**@author Sakshi Mourya
	 * POST endpoint to login a employee.
	 * 
	 * @param  The employee ID and OTP is provided in the request body.
	 * 
	 * @return The result of the login Employee.
	 */
	@PostMapping("login/{employeeID}/{otp}")
	public ResponseEntity<Object> loginEmployee(@PathVariable int employeeID, @PathVariable int otp) {
		return ResponseEntity.ok(empservice.loginEmployee(employeeID, otp));
	}

}
