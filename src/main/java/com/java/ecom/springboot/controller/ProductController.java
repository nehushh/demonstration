package com.java.ecom.springboot.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecom.springboot.entity.Product;
import com.java.ecom.springboot.service.ProductService;

@RestController
@RequestMapping("/ecom/products")
public class ProductController {
	
	private ProductService prodService;

	public ProductController(ProductService prodService) {
		super();
		this.prodService = prodService;
	}
	
	//Rest API to search list of products	
	@GetMapping("/search")
	public ResponseEntity<List<Product>> searchProducts(@RequestParam("skuSearch") String skuSearch){
		return ResponseEntity.ok(prodService.searchProducts(skuSearch));
	}
	
	//Rest API to create Product
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return prodService.createProduct(product);
	}

}
