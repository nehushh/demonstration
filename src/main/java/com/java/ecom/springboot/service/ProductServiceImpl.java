package com.java.ecom.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.java.ecom.springboot.entity.Product;
import com.java.ecom.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> searchProducts(String skuSearch) {
		List<Product> products = productRepository.searchProducts(skuSearch);
		return products;
	}

	@Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}
