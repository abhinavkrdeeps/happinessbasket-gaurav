package com.virtusa.happinessbasket.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.virtusa.happinessbasket.model.Category;
import com.virtusa.happinessbasket.model.DeliveryPerson;
import com.virtusa.happinessbasket.model.Product;

@Repository
public class CategoryDAOImpl implements CategoryDAO{
	

	
	public void addCategory(Category category) {
		Session session=new Configuration().configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.save(category);
		session.getTransaction().commit();
		session.close();
		return ;
	}

	public void deleteCategory(Category category) {
		Session session=new Configuration().addAnnotatedClass(Product.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.delete(category);
		session.getTransaction().commit();
         session.close();
	}
	
	public Category updateCategory(Category category) {
		//sessionFactory.getCurrentSession().update(employee);
		// return employee;
		Session session = new Configuration().addAnnotatedClass(Category.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		session.update(category);
		session.getTransaction().commit();
		session.close();
		return category;
	}

	public Category getCategoryById(int categoryid) {
		Session session = new Configuration().addAnnotatedClass(Category.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		Query q =  session.createQuery("from Category c where c.categoryid=:catid");
		q.setParameter("catid", categoryid);
		Category category = (Category)q.uniqueResult();
		session.getTransaction().commit();
		return category;
	}

	public List<Category> getAllCategory() {
		Session session = new Configuration().addAnnotatedClass(Category.class).configure().buildSessionFactory().openSession();
		session.beginTransaction();
		Query<Category> q = session.createQuery("from Category");
		List<Category> categoryList = q.getResultList();
		return categoryList;
	}
}
