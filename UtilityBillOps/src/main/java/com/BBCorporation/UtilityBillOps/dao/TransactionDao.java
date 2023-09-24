package com.BBCorporation.UtilityBillOps.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.BBCorporation.UtilityBillOps.entity.Customer;
import com.BBCorporation.UtilityBillOps.entity.Invoice;
import com.BBCorporation.UtilityBillOps.entity.Transaction;

@Repository
public class TransactionDao {
	
	@Autowired
	SessionFactory factory;

	public List<Transaction> getAllTransaction() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Transaction.class);
		return criteria.list();
	}

	public Transaction getTransactionbyCustomerID(int customerID) {
		Session session = factory.openSession();
		return session.get(Transaction.class, customerID);
	}

	public String deleteCustomerTransaction(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.get(Transaction.class, id);
		session.delete(transaction);
		session.beginTransaction().commit();
		return "Transaction delete Successfully!!!";
	}

	public List<Transaction> getAllPayment() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Transaction.class);
		return criteria.list();
	}

	public Transaction getPaymentofSpecificCustomer(int customerID) {
		Session session = factory.openSession();
		return session.get(Transaction.class, customerID);
	}


	public Transaction makePayment(Transaction payment) {
		Session session = factory.openSession();
		session.save(payment);
		session.beginTransaction().commit();	
		return payment;
		
	}

	public Transaction makeTransation(Transaction maintaintransation) {
		Session session = factory.openSession();
		session.save(maintaintransation);
		session.beginTransaction().commit();
		return maintaintransation;
	}

	

	
}
