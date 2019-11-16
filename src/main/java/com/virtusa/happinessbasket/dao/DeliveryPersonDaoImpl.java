package com.virtusa.happinessbasket.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.model.Customer;
import com.virtusa.happinessbasket.model.DeliveryPerson;

@Repository
public class DeliveryPersonDaoImpl implements DeliveryPersonDao {


	public void addDeliveryPerson(DeliveryPerson deliveryperson) {
		System.out.println("Adding Delivery Person in dao");
		Session session = new Configuration().addAnnotatedClass(DeliveryPerson.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(deliveryperson);
		session.getTransaction().commit();
		session.close();

	}

	public List<DeliveryPerson> getAllDeliveryPerson() {
		Session session = new Configuration().addAnnotatedClass(DeliveryPerson.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		Query q = session.createQuery("from DeliveryPerson");
		List deliverypersonList = q.getResultList();
		return deliverypersonList;
	}

	


	public DeliveryPerson updateDeliveryPerson(DeliveryPerson deliveryperson) {
		//sessionFactory.getCurrentSession().update(employee);
		// return employee;
		Session session = new Configuration().addAnnotatedClass(DeliveryPerson.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.update(deliveryperson);
		session.getTransaction().commit();


		return deliveryperson;
	}

	public DeliveryPerson getDeliveryPersonById(int deliverypersonId) {
		Session session = new Configuration().addAnnotatedClass(DeliveryPerson.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(deliverypersonId);
		Query q =  session.createQuery("from DeliveryPerson where deliverypersonId=:deliverypersonId");
		q.setParameter("deliverypersonId", deliverypersonId);
		DeliveryPerson deliveryperson = (DeliveryPerson)q.uniqueResult();
		System.out.println(deliveryperson);
		session.getTransaction().commit();
		System.out.println(deliveryperson);

		return deliveryperson;
	}
	
	public DeliveryPerson deleteADeliveryPerson(DeliveryPerson deliveryPerson)
	{
		Session session = new Configuration().addAnnotatedClass(DeliveryPerson.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.delete(deliveryPerson);
		session.getTransaction().commit();
		session.close();
		return deliveryPerson;
	}
	
	public DeliveryPerson getDeliveryPersonByemailId(String emailid) {

		Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(emailid);
		Query q =  session.createQuery("from DeliveryPerson where emailId=:emailid");
		q.setParameter("emailid", emailid);
		DeliveryPerson deliveryperson = (DeliveryPerson)q.uniqueResult();
		session.getTransaction().commit();

		return deliveryperson;
	}
	
	

}






