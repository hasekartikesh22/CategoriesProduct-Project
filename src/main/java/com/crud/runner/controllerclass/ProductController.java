package com.crud.runner.controllerclass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.runner.entity.Product;
import com.crud.runner.service.ProductService;

@RestController
@RequestMapping("api/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(value="/save")
	public boolean saveProduct(@RequestBody Product product) {
		
		boolean b= service.addProduct(product);	
		return b;	
	}

	@DeleteMapping(value="/delete")
	public boolean deleteProduct(@RequestParam int id) {
		boolean b= service.deleteProduct(id);
		return b;		
	}
	
	@PutMapping(value="/update")
	public String updateProduct(@RequestBody Product product) {
	String msg=	service.updateProduct(product);
		return msg;
		
	}
	
	@GetMapping(value="/getProduct")
	public Product getProduct(@RequestParam int id) {
		Product product= service.getproduct(id);
		return product;
		
	}
	@GetMapping(value="/list")
	public List<Product> listOfProduct(Product product){
		List<Product> list= service.listOfProduct();	
		return list;	
	}
}
