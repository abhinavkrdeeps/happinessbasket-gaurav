package com.virtusa.happinessbasket.dao;

import java.util.List;

import com.virtusa.happinessbasket.model.Product;

public interface ProductDao {

	List<Product> getAllProduct();
	Product deleteProduct(Product product);
	Product addProduct(Product product);
	Product updateProduct(Product product);
	Product getProductById(int id);
}
