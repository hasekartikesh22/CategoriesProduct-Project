package com.crud.runner.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.crud.runner.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	
	@Autowired
	private SessionFactory sf;
	
	@Override
	public boolean addProduct(Product product) {
		boolean b=false;
		Session session=sf.getCurrentSession();
		session.save(product);
		session.beginTransaction().commit();
		b=true;
		session.close();
		return b;
	}

	@Override
	public Product getproduct(int id) {
	
		Session session=sf.getCurrentSession();
		Product product= session.get(Product.class, id);
		
		return product;
	}

	@Override
	public List<Product> listOfProduct() {
		Session session= sf.getCurrentSession();
		Criteria criteria=session.createCriteria(Product.class);
	    List<Product> list=criteria.list();
		return list;
	}

	@Override
	public boolean deleteProduct(int id) {
		boolean b=false;
		Session session= sf.getCurrentSession();
		Product employee=	session.load(Product.class, id);
			session.delete(employee);
		    b=true;		
		    session.beginTransaction().commit();
			return b;
	}

	@Override
	public String updateProduct(Product product) {
		String msg="not updated";
		Session session= sf.getCurrentSession();
		session.update(product);
		msg="update successfully";
		 session.beginTransaction().commit();
		return msg;
	}

}
