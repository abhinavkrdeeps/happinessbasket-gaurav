package com.virtusa.happinessbasket.dao;

import java.util.List;
import com.virtusa.happinessbasket.model.DeliveryPerson;

interface DeliveryPersonDao {

		void addDeliveryPerson(DeliveryPerson deliveryperson);

		List<DeliveryPerson> getAllDeliveryPerson();

		DeliveryPerson getDeliveryPersonById(int deliverypersonId);
		
		DeliveryPerson getDeliveryPersonByemailId(String emailId);
		
		DeliveryPerson updateDeliveryPerson(DeliveryPerson deliveryperson);
		
		

	}

