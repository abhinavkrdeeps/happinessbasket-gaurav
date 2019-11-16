package com.virtusa.happinessbasket.service;

import java.util.List;

import com.virtusa.happinessbasket.model.Product;



public interface ProductService {
public void addProduct(Product p);
public void updateProduct(Product p);
public void deleteProduct(Product p);
public List<Product> getAllProducts();
public Product getProductById(int productId);

}
