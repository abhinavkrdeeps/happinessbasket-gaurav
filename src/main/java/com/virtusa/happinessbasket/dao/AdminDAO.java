package com.virtusa.happinessbasket.dao;

import java.util.List;

import com.virtusa.happinessbasket.model.Admin;

public interface AdminDAO {
	public Admin add(Admin admin);
	public boolean delete(Admin admin);
	public Admin update(Admin admin);
	public boolean fetchById(Admin admin);
	public List<Admin> fetchAll();
	
	
}
