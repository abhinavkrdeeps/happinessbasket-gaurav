package com.virtusa.happinessbasket.dao;

import java.util.List;

import com.virtusa.happinessbasket.model.Category;

public interface CategoryDAO {
	public void addCategory(Category category);
	public void deleteCategory(Category category);
	public Category updateCategory(Category category);
	public List<Category> getAllCategory();
	public Category getCategoryById(int categoryId);
	
}
