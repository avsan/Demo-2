package com.satya.hibernate.dao;

import com.satya.hibernate.modal.Product;

public interface ProductDAO {

	void saveProduct(Product product);
	Product readProduct(int productId);
	
}
