package com.BBCorporation.UtilityBillOps.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BBCorporation.UtilityBillOps.entity.Customer;
import com.BBCorporation.UtilityBillOps.entity.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory factory;

	public Employee loginEmployee(int employeeID) {
		Session session = factory.openSession();
		return session.get(Employee.class, employeeID);
	}

}
