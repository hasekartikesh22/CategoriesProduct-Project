package com.crud.runner.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.runner.entity.Category;
import com.crud.runner.entity.Product;

@Repository
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public boolean addCategory(Category category) {
		boolean b=false;
		Session session=sf.getCurrentSession();
		session.save(category);
		session.beginTransaction().commit();
		b=true;
		session.close();
		return b;
	}

	@Override
	public Category getCategory(int id) {
		Session session=sf.getCurrentSession();
		Category category= session.get(Category.class, id);
		
		return category;
	}

	@Override
	public List<Category> listOfCategory() {
		Session session= sf.getCurrentSession();
		Criteria criteria=session.createCriteria(Category.class);
	    List<Category> list=criteria.list();
		return list;
	}

	@Override
	public boolean deleteCategory(int id) {
		boolean b=false;
		Session session= sf.getCurrentSession();
		Category category=	session.load(Category.class, id);
			session.delete(category);
		    b=true;		
		    session.beginTransaction().commit();
			return b;
	}

	@Override
	public String updateCategory(Category category) {
		String msg="not updated";
		Session session= sf.getCurrentSession();
		session.update(category);
		msg="update successfully";
		 session.beginTransaction().commit();
		return msg;
	}

}
