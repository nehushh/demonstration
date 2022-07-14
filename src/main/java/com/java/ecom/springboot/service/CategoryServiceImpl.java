package com.java.ecom.springboot.service;

import org.springframework.stereotype.Service;

import com.java.ecom.springboot.entity.Category;
import com.java.ecom.springboot.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository categoryRepository;

	@Override
	public Category createCategory(Category category) {
		return categoryRepository.save(category);
	}

}
