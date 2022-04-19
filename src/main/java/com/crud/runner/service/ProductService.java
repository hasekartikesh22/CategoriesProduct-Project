package com.crud.runner.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.crud.runner.entity.Product;


public interface ProductService {
	
	 boolean addProduct(Product product);
	 Product getproduct(int id);
	 List<Product> listOfProduct();
	 boolean deleteProduct(int id);
	 String updateProduct(Product product);
	

}
