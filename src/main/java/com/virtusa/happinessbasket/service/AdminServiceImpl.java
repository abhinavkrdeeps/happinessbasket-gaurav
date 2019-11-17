package com.virtusa.happinessbasket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.happinessbasket.dao.AdminDAO;
import com.virtusa.happinessbasket.model.Admin;


@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;
	
	public Admin add(Admin admin) {
		 return adminDAO.add(admin);
	}

//	public boolean delete(Admin admin) {
//		return adminDAO.delete(admin);
//		
//	}
//
//	public Admin update(Admin admin) {
//		return adminDAO.update(admin);
//	}
//
	public boolean fetchById(Admin admin) {
		return adminDAO.fetchById(admin);
	}
//
	public List<Admin> fetchAll() {
		return adminDAO.fetchAll();
	}
//
//	public boolean validateLoginPassword(String username, String password) {
//		
//		return false;
//	}

}
