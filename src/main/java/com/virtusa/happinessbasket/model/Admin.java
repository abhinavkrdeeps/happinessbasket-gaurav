package com.virtusa.happinessbasket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int aid;
	@Column
	private String name;
	private String emailId;
	public String getEmailid() {
		return emailId;
	}
	public void setEmailid(String emailid) {
		this.emailId = emailid;
	}

	@Column
	private String username;
	@Column
	private String password;

	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Admin(int aid, String name, String emailid, String username, String password) {
		super();
		this.aid = aid;
		this.name = name;
		this.emailId = emailid;
		this.username = username;
		this.password = password;
	}
	public Admin() {
		super();
	}
	
	
	
	
	
	
	
	
	
}
