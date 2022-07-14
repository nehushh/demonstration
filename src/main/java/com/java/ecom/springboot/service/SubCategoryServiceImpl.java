package com.java.ecom.springboot.service;

import org.springframework.stereotype.Service;

import com.java.ecom.springboot.entity.SubCategory;
import com.java.ecom.springboot.repository.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService{
	
	private SubCategoryRepository subCategoryRepository;

	@Override
	public SubCategory createSubCategory(SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}


}
