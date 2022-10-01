package com.greatlearning.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.greatlearning.crm.service.CrmService;
import com.greatlearning.crm.entity.Crm;

@Repository
public class CrmServiceImpl implements CrmService {

	private SessionFactory sessionFactory;

	// create session
	private Session session;

	@Autowired
	CrmServiceImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

	}

	@Transactional
	public List<Crm> findAll() {

		Transaction tx = session.beginTransaction();

		// find all the records from the database table
		List<Crm> crms = session.createQuery("from Crm").list();

		tx.commit();

		return crms;
	}

	@Transactional
	public Crm findById(int id) {

		Crm crm = new Crm();

		Transaction tx = session.beginTransaction();

		// find record with Id from the database table
		crm = session.get(Crm.class, id);

		tx.commit();

		return crm;
	}

	@Transactional
	public void save(Crm theCrm) {

		Transaction tx = session.beginTransaction();

		// save transaction
		session.saveOrUpdate(theCrm);

		tx.commit();

	}

	@Transactional
	public void deleteById(int id) {

		Transaction tx = session.beginTransaction();

		// get transaction
		Crm crm = session.get(Crm.class, id);

		// delete record
		session.delete(crm);

		tx.commit();

	}

}
