package com.java.ecom.springboot.service;

import java.util.List;

import com.java.ecom.springboot.entity.Product;

public interface ProductService {
	
	List<Product> searchProducts(String skuSearch);
	
	Product createProduct(Product product);

}
