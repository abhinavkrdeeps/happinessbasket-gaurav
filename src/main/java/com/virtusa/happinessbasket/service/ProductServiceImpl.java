package com.virtusa.happinessbasket.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.happinessbasket.dao.ProductDaoImpl;
import com.virtusa.happinessbasket.model.Cart;
import com.virtusa.happinessbasket.model.Product;


@Service
public class ProductServiceImpl implements ProductService{


	@Autowired
	ProductDaoImpl productDao;

	public void addProduct(Product p) {
		productDao.addProduct(p);


	}

	public List<Product> getAllProducts(){

		List<Product> products= productDao.getAllProduct();
		System.out.println(products);

		return products;
	}


	public Product getProductById(int productId) {
		Product product=new Product();
		product = productDao.getProductById(productId);
		System.out.println(product);
		return product;
	}

	public void updateProduct(Product p) {
		productDao.updateProduct(p);

	}

	public void deleteProduct(Product p) {
		productDao.deleteProduct(p);

	}



	public static void main(String[] args) {

		ProductServiceImpl s= new ProductServiceImpl();
		Product l = s.getProductById(2);
		System.out.println(l);
	}
}
