package com.java.ecom.springboot.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String productId;
	private String productName;
	private String description;
	private String tags;	
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Product_Category", 
        joinColumns = { @JoinColumn(name = "productId") }, 
        inverseJoinColumns = { @JoinColumn(name = "categoryId") }
    )
	private List<Category> categoryList;
	
	@ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Product_SubCategory", 
        joinColumns = { @JoinColumn(name = "productId") }, 
        inverseJoinColumns = { @JoinColumn(name = "subCategoryId") }
    )
	private List<SubCategory> subCategoryList;
	
	
	
}
