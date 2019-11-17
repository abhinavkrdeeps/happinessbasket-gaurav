package com.virtusa.happinessbasket.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.model.Admin;

@Repository
public class AdminDAOImpl implements AdminDAO {
	Session session=new Configuration().configure().buildSessionFactory().openSession();
//	session.beginTransaction();
	
	public Admin add(Admin admin) {
//		Session session=new Configuration().addAnnotatedClass(Admin.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(admin);
		session.getTransaction().commit();
		return admin;	
	}

	public boolean delete(Admin admin) {
//		sessionFactory.getCurrentSession().delete(admin);
		
		return false;
	}
//
	public Admin update(Admin admin) {
//		sessionFactory.getCurrentSession().update(admin);
			 //sessionFactory.getCurrentSession().update(employee);
		       // return employee;
//			Session session = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory().openSession();
			session.beginTransaction();
			session.update(admin);
			session.getTransaction().commit();
			
			
			return admin;
		}
		
	

	public boolean fetchById(Admin admin) {
	//	Session session = new Configuration().addAnnotatedClass(Admin.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		
		String hql= "SELECT password FROM Admin WHERE aid = :aid";
		Query query = session.createQuery(hql); 
		query.setParameter("aid",admin.getAid());// value from ui
		List list =query.getResultList();
		session.getTransaction().commit();
//		session.close();
		if(!(list.isEmpty()))
		{
			if(admin.getPassword().equals(list.get(0)))
			{

				return true;
			}
		
		else

				return false;
		}
		else
			return false;
//		return (Admin)sessionFactory.getCurrentSession().get(Admin.class, aid);
	}
//
	@SuppressWarnings("unchecked")
	public List<Admin> fetchAll() {
//		Session session = new Configuration().addAnnotatedClass(Admin.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		List<Admin> adminList = (List<Admin>)session.createQuery("from Admin").list();
		session.getTransaction().commit();
		
		return adminList;
	}
//	session.close();
	public static void main(String[] args) {
		AdminDAOImpl dao= new AdminDAOImpl();
		List<Admin> fetchAll = dao.fetchAll();
		for(Admin a:fetchAll)
		{
			System.out.println(a.getAid() + " " + a.getName());
		}
		System.out.println(fetchAll);
	}

}
	
