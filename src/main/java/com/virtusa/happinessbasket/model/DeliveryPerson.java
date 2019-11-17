package com.virtusa.happinessbasket.model;

	import java.util.List;

	import javax.persistence.ElementCollection;
	import javax.persistence.Embedded;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

	@Entity
	@Table(name="deliveryperson")
	public class DeliveryPerson {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int deliverypersonId;
		private String firstName;
		private String lastName;
		private String Phone;
		private String emailId;
		private String password;
		
		
		@Override
		public String toString() {
			return "Customer [customerId=" + deliverypersonId + ", firstName=" + firstName + ", lastName=" + lastName
					+ ", Phone=" + Phone + ", emailId=" + emailId + ", password=" + password + "]";
		}
		
		public DeliveryPerson(int deliverypersonId, String firstName, String lastName, String customerPhone, String emailId,
				String password, String Phone) {
			super();
			this.deliverypersonId = deliverypersonId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.Phone = Phone;
			this.emailId = emailId;
			this.password = password;
		}
		
		
		public DeliveryPerson() {
			super();
		}

		public Integer getDeliverypersonId() {
			return deliverypersonId;
		}

		public void setDeliverypersonId(Integer deliverypersonId) {
			this.deliverypersonId = deliverypersonId;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		

		public String getPhone() {
			return Phone;
		}

		public void setPhone(String phone) {
			Phone = phone;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		
		
		
	}


