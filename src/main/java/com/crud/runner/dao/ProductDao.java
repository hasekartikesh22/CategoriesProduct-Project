package com.crud.runner.dao;

import java.util.List;

import com.crud.runner.entity.Product;

public interface ProductDao {

	 boolean addProduct(Product product);
	 Product getproduct(int id);
	 List<Product> listOfProduct();
	 boolean deleteProduct(int id);
	 String updateProduct(Product product);
	
}
