package com.satya.hibernate.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.satya.hibernate.modal.Product;
import com.satya.hibernate.utill.HibernateUtill;

public class ProductImpl implements ProductDAO {

	SessionFactory factory;
	@Override
	public void saveProduct(Product product) {
		
		factory=HibernateUtill.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(product);
		transaction.commit();
		System.out.println("Product is saved in database");
	}

	@Override
	public Product readProduct(int productId) {
		

		factory=HibernateUtill.getSessionFactory();
		Session session = factory.openSession();
		Product product =(Product) session.get(Product.class, productId);
		
		return product;
	}

}
