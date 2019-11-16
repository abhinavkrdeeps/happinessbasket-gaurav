package com.virtusa.happinessbasket.service;

	import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
	import org.springframework.stereotype.Service;

import com.virtusa.happinessbasket.hibernateiutil.HibernateUtil;
import com.virtusa.happinessbasket.model.DeliveryPerson;



	@Service
	public class DeliveryPersonService {
		public DeliveryPerson addDeliveryPerson(DeliveryPerson deliveryperson) {
			Session session = HibernateUtil.getSession();
			session.beginTransaction();
			session.save(deliveryperson);
			session.getTransaction().commit();
			session.close();
			return deliveryperson;
			
		}
		
public List<DeliveryPerson> showDeliveryPerson() {
			Session session = HibernateUtil.getSession();
			session.beginTransaction();
			TypedQuery query=session.createQuery("from DeliveryPerson");
			List<DeliveryPerson> dpl= query.getResultList();
			session.close();
			return dpl;	
		}
	}


