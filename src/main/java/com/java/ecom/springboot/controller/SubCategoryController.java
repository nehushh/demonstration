package com.java.ecom.springboot.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ecom.springboot.entity.SubCategory;
import com.java.ecom.springboot.service.SubCategoryService;

@RestController
@RequestMapping("/ecom/subCategory")
public class SubCategoryController {
	
private SubCategoryService subCategoryService;
	
	public SubCategoryController(SubCategoryService subCategoryService) {
		super();
		this.subCategoryService = subCategoryService;
	}
	
	@PostMapping
	public SubCategory createSubCategory(@RequestBody SubCategory subCategory) {
		return subCategoryService.createSubCategory(subCategory);
	}

}
