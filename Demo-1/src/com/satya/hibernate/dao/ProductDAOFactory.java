package com.satya.hibernate.dao;

public class ProductDAOFactory {

	public static ProductDAO getInstance(){
		
		return new ProductImpl();
	}
}
