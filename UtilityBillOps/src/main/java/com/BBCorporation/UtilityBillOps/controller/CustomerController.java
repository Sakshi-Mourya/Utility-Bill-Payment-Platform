package com.BBCorporation.UtilityBillOps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.BBCorporation.UtilityBillOps.entity.Customer;
import com.BBCorporation.UtilityBillOps.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CustomerController {

	@Autowired
	CustomerService customerservice;

	/**@author Sakshi Mourya
	 * GET endpoint to get the details of all customer.
	 * 
	 * @return The result to get a List of all customer.
	 */
	
	@GetMapping("GetAllCustomerInfo")
	public List<Customer> getAllCustomerInfo() {
		return customerservice.getAllCustomerInfo();
	}
	
	/**@author Sakshi Mourya
	 * GET endpoint to get a customer.
	 * 
	 * @param  The customer ID is provided in the path variable.
	 * 
	 * @return The result to get a information of specific customer.
	 */

	@GetMapping("getSpecificCustomer/{customerID}")
	public ResponseEntity<Object> getSpecificCustomerbyID(@PathVariable int customerID) {
		return (ResponseEntity.ok(customerservice.getSpecificCustomerbyID(customerID)));
	}

	/**@author Sakshi Mourya
	 * POST endpoint to add a new customer.
	 * 
	 * @param  The customer details provided in the request body.
	 * 
	 * @return The result of the adding customer.
	 */
	
	@PostMapping("AddCustomer")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer customer) {
		return (ResponseEntity.ok(customerservice.addCustomer(customer)));
	}
	/**@author Sakshi Mourya
	 * POST endpoint to add a new customerin a bulk through CSV file.
	 * 
	 * @param  The all customer details provided in the request body.
	 * 
	 * @return The result of the adding customer in bulk.
	 */

	@PostMapping("AddCustomerInBulk")
	public ResponseEntity<Object> addCustomerInBulk(@RequestParam("file") MultipartFile file) {
		if (file.isEmpty()) {
			return ResponseEntity.badRequest().body("Please select a CSV file to upload.");
		} else {
			return customerservice.addCustomerInBulk(file);
		}
	}
	
	/**
	 * @author Sakshi Mourya DELETE endpoint to delete a customer.
	 * 
	 * @param The customer ID is provided in the path variable.
	 * 
	 * @return The result to delete a information of specific customer.
	 */

	@DeleteMapping("deleteCustomerbyID/{customerID}")
	public ResponseEntity<Object> deleteCustomerbyID(@PathVariable int customerID) {
		return (ResponseEntity.ok(customerservice.deleteCustomerbyID(customerID)));
	}
	/**@author Sakshi Mourya
	 * POST endpoint to create a new bill.
	 * 
	 * @param  The customer details provided in the request body.
	 * 
	 * @return The result of the generating a bill customer.
	 */

	@PostMapping("CreateBill")
	public ResponseEntity<Object> CreateBill(@RequestBody Customer bill) {
		return (ResponseEntity.ok(customerservice.CreateBill(bill)));
	}
	
	/**@author Sakshi Mourya
	 * GET endpoint to get the bill of all customer.
	 * 
	 * @return The result to get a List of all bill.
	 */
	@GetMapping("getAllBill")
	public List<Customer> getAllBill() {
		return customerservice.getAllBill();
	}
	/**@author Sakshi Mourya
	 * GET endpoint to get a bill of specific customer.
	 * 
	 * @param  The customer ID is provided in the path variable.
	 * 
	 * @return The result to get a bill of specific customer.
	 */

	@GetMapping("getBillofSpecificCustomer/{customerID}")
	public ResponseEntity<Object> getBillofSpecificCustomerbyID(@PathVariable int customerID) {
		return (ResponseEntity.ok(customerservice.getBillofSpecificCustomerbyID(customerID)));
	}
	
	/**@author Sakshi Mourya
	 * Update endpoint to update a bill of specific customer.
	 * 
	 * @param  The customer ID is provided in the path variable.
	 * 
	 * @return The result to update a bill of specific customer.
	 */
	
	@PutMapping("UpdateBill")
	public ResponseEntity<Object>UpdateBill(@RequestBody Customer bill) {
		return (ResponseEntity.ok(customerservice.UpdateBill(bill)));
	}
	/**@author Sakshi Mourya
	 * POST endpoint to delete a bill.
	 * 
	 * @param  The customer ID provided in the request body.
	 * 
	 * @return The result of the deleting a bill of specific customer.
	 */

	@DeleteMapping("deleteCustomerBill/{customerID}")
	public String deleteCustomerBill(@PathVariable int customerID) {
		return customerservice.deleteCustomerBill(customerID);
	}

}
