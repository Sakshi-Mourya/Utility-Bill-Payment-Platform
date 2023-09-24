package com.BBCorporation.UtilityBillOps.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BBCorporation.UtilityBillOps.entity.Customer;

@Repository
public class CustomerDao {

	@Autowired
	SessionFactory factory;

	public List<Customer> getAllCustomerInfo() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	public Customer getSpecificCustomerbyID(int customerID) {
		Session session = factory.openSession();
		return session.get(Customer.class, customerID);
	}

	public String addCustomer(Customer customer) {
		Session session = factory.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		return "Customer Added Successfully!!!";
	}

	public Customer addCustomerInBulk(Customer customer) {
		Session session = factory.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		return customer;
	}

	public String deleteCustomerbyID(int customerID) {
		Session session = factory.openSession();
		Customer customer = session.get(Customer.class, customerID);
		session.delete(customer);
		session.beginTransaction().commit();
		return "Customer delete Successfully!!!";
	}

	public String CreateBill(Customer bill) {
		Session session = factory.openSession();
		session.save(bill);
		session.beginTransaction().commit();
		return "Bill Created Successfully!!!";
	}

	public List<Customer> getAllBill() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}

	public Customer getBillofSpecificCustomerbyID(int customerID) {
		Session session = factory.openSession();
		return session.get(Customer.class, customerID);
	}

	public String UpdateBill(Customer bill) {
		Session session = factory.openSession();
		session.update(bill);
		session.beginTransaction().commit();
		return "Bill Updated Successfully!!!";
	}

	public String deleteCustomerBill(int customerID) {
		Session session = factory.openSession();
		Customer bill = session.get(Customer.class, customerID);
		session.delete(bill);
		session.beginTransaction().commit();
		return "Bill delete Successfully!!!";
	}

}
