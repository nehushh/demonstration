package com.java.ecom.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.ecom.springboot.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
