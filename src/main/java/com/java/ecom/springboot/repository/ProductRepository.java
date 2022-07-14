package com.java.ecom.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.java.ecom.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("Select p.* from products p, category c, subcategory sc,product_category pc, product_subcategory ps where "+
			"p.productname like Concat('%', :skuSearch, '%') OR"+
			"p.description like Concat('%', :skuSearch, '%') OR"+
			"c.name like Concat('%', :skuSearch, '%') OR"+
			"p.tags like Concat('%', :skuSearch, '%') OR"+
			"sc.name like Concat('%', :skuSearch, '%') AND"+
			"(p.productId=pc.productId AND"+
			"c.categoryId = pc.categoryId) OR"+
			"(p.productId=ps.productId AND" +
			"sc.subcategoryid=ps.subcategoryid)")
	List<Product> searchProducts(String skuSearch);

}


