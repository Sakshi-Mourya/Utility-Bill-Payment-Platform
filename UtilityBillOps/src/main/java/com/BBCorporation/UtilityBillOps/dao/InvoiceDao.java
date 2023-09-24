package com.BBCorporation.UtilityBillOps.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.BBCorporation.UtilityBillOps.entity.Customer;
import com.BBCorporation.UtilityBillOps.entity.Invoice;

@Repository
public class InvoiceDao {

	@Autowired
	SessionFactory factory;
	
	public Invoice generateInvoice(Invoice invoice) {
		Session session = factory.openSession();
		session.save(invoice);
		session.beginTransaction().commit();	
		return invoice;
	}

	public List<Invoice> getAllInvoice() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Invoice.class);
		return criteria.list();
	}

	public Invoice getInvoiceofSpecificCustomer(int customerID) {
		Session session = factory.openSession();
		return session.get(Invoice.class, customerID);
	}

 
}
