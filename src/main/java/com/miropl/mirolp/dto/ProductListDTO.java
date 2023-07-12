package com.miropl.mirolp.dto;

import com.miropl.mirolp.entities.ProductList;

public class ProductListDTO {

	private Long id;
	private String name;
	
	public ProductListDTO() {
	}
	
	public ProductListDTO(ProductList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
