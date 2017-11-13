package com.spring.cachingannotations.service;

import com.spring.cachingannotations.model.Product;

public interface ProductService {

	Product getByName(String name);
	void refreshAllProducts();
	Product updateProduct(Product product);
	
}
