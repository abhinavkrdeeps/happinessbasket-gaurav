package com.virtusa.happinessbasket.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.model.Customer;
import com.virtusa.happinessbasket.model.ShippingAddress;


@Repository
public class ShippingDao {

	public void addShippingAddress(ShippingAddress address) {

		Session session = new Configuration().addAnnotatedClass(ShippingAddress.class).configure().buildSessionFactory().openSession();
		try {
			session.beginTransaction();
			System.out.println("entered  into service class to save shipping address"+address);
			session.saveOrUpdate(address);
			System.out.println("completed");
			session.getTransaction().commit();
			session.close();
		    }
		catch(Exception e) {
			session.getTransaction().rollback();	
		}

	}
	public boolean delShippingAddress(int addressId)
	{
		Session session = new Configuration().addAnnotatedClass(ShippingAddress.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		System.out.println(addressId);
		Query q =  session.createQuery("from ShippingAddress where addressId=:addressId");
		q.setParameter("addressId", addressId);
	    ShippingAddress shippingaddress = (ShippingAddress)q.uniqueResult();
		System.out.println(shippingaddress);
		if(shippingaddress != null) 
		{
		session.delete(shippingaddress);
		session.getTransaction().commit();
		return true;
		}
		else
		return false;	
	}
	

	public static void main(String[] args) {
		ShippingDao dao=new ShippingDao();
		ShippingAddress address= new ShippingAddress();
		boolean delShippingAddress = dao.delShippingAddress(4);
		if(delShippingAddress)
		{
			System.out.println("done");
		}
		else
			System.out.println("fail");
	}

}
