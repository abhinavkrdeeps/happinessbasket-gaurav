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
	
	
	
	public Admin() {
		
	}
	
	public Admin(int aid, String name, String username, String password) {
		this.aid = aid;
		this.name = name;
		this.username = username;
		this.password = password;
	
	
	}
	
	
	
	
}
