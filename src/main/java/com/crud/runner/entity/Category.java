package com.crud.runner.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name="cat_id")
	private int Category_id;
	private String category_name;
	
	public Category() {
		super();
	}

	public Category(int category_id, String category_name) {
		super();
		Category_id = category_id;
		this.category_name = category_name;
	}

	public int getCategory_id() {
		return Category_id;
	}

	public void setCategory_id(int category_id) {
		Category_id = category_id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	@Override
	public String toString() {
		return "Category [Category_id=" + Category_id + ", category_name=" + category_name + "]";
	}
	
	

}
