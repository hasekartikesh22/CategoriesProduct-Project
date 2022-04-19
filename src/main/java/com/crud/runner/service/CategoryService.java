package com.crud.runner.service;

import java.util.List;

import com.crud.runner.entity.Category;

public interface CategoryService {
	 boolean addCategory(Category category);
	 Category getCategory(int id);
	 List<Category> listOfCategory();
	 boolean deleteCategory(int id);
	 String updateCategory(Category category);
	
	

}
