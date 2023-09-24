package com.BBCorporation.UtilityBillOps.service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.io.InputStreamReader;
import java.io.Reader;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.BBCorporation.UtilityBillOps.dao.CustomerDao;
import com.BBCorporation.UtilityBillOps.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao customerdao;

	public List<Customer> getAllCustomerInfo() {
		return customerdao.getAllCustomerInfo();
	}

	public Customer getSpecificCustomerbyID(int customerID) {
		return customerdao.getSpecificCustomerbyID(customerID);
	}

	public String addCustomer(Customer customer) {
		return customerdao.addCustomer(customer);
	}

	public ResponseEntity<Object> addCustomerInBulk(MultipartFile file) {

		try (Reader reader = new InputStreamReader(file.getInputStream());
				CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT.withHeader())) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");

			for (CSVRecord csvRecord : csvParser) {

				// Perform data validation here
				int customerID = Integer.parseInt(csvRecord.get("customerID"));
				String customerName = csvRecord.get("customerName");
				String customerEmail = csvRecord.get("customerEmail");
				String customerContact = csvRecord.get("customerContact");
				int billID = Integer.parseInt(csvRecord.get("billID"));
				String billDuration = csvRecord.get("billDuration");
				java.util.Date billDueDate = dateFormat.parse(csvRecord.get("billDueDate"));
				int unitConsumption = (int) Double.parseDouble(csvRecord.get("unitConsumption"));

				Customer customer = new Customer(customerID, customerName, customerEmail, customerContact, billID,
						unitConsumption, billDueDate, billDuration);

				customerdao.addCustomerInBulk(customer);
			}

			return ResponseEntity.ok("CSV data uploaded successfully.");

		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body("Error occurred while processing the CSV file.");
		}
	}

	public String deleteCustomerbyID(int customerID) {
		return customerdao.deleteCustomerbyID(customerID);
	}

	public String CreateBill(Customer bill) {
		return customerdao.CreateBill(bill);
	}

	public List<Customer> getAllBill() {
		return customerdao.getAllBill();
	}

	public Customer getBillofSpecificCustomerbyID(int customerID) {
		return customerdao.getBillofSpecificCustomerbyID(customerID);
	}

	public String UpdateBill(Customer bill) {
		return customerdao.UpdateBill(bill);
	}

	public String deleteCustomerBill(int customerID) {
		return customerdao.deleteCustomerBill(customerID);
	}

}
