package com.virtusa.happinessbasket.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.hibernateiutil.HibernateUtil;
import com.virtusa.happinessbasket.model.Customer;
import com.virtusa.happinessbasket.model.Product;

@Repository
public class ProductDaoImpl implements ProductDao{

	public List<Product> getAllProduct() {
		Session session= HibernateUtil.getSession();
		session.beginTransaction();
		TypedQuery<Product> query=session.createQuery("from Product");
		return query.getResultList();
	}

	public Product deleteProduct(Product product) {
		Session session= HibernateUtil.getSession();
		session.beginTransaction();
		session.delete(product);
		session.close();
		return product;
	}

	public Product addProduct(Product product) {
		Session session= HibernateUtil.getSession();
		session.beginTransaction();
		session.save(product);
		session.getTransaction().commit();
		session.close();
		return product;
		
	}

	public Product updateProduct(Product product) {
		Session session= HibernateUtil.getSession();
		session.beginTransaction();
		session.saveOrUpdate(product);
		session.getTransaction().commit();
		session.close();
		return product;
	}

	public Product getProductById(int productId) {
		Session session = new Configuration().addAnnotatedClass(Product.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		TypedQuery<Product> q =  session.createQuery("from Product where productId=:productId");
		q.setParameter("productId", productId);
		Product product = (Product)q.getResultList().get(0);
		return product;		
	}
}
