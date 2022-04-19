package com.crud.runner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.runner.dao.ProductDao;
import com.crud.runner.entity.Product;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	
	@Override
	public boolean addProduct(Product product) {
		boolean b=dao.addProduct(product);
		return b;
	}

	@Override
	public Product getproduct(int id) {
		Product product= dao.getproduct(id);
		
		return product;
	}

	@Override
	public List<Product> listOfProduct() {
		List<Product> list= dao.listOfProduct();
		return list;
	}

	@Override
	public boolean deleteProduct(int id) {
		boolean b= dao.deleteProduct(id);
		return b;
	}

	@Override
	public String updateProduct(Product product) {
		String msg=dao.updateProduct(product);
		return msg;
	}

}
