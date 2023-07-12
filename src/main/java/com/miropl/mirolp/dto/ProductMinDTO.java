package com.miropl.mirolp.dto;

import com.miropl.mirolp.entities.Product;

public class ProductMinDTO {

	private Long id;
	private String name;
	private Double quantity;
	private Double price;
	private String imgUrl;
	private String shortDescription;
	
	public ProductMinDTO() {
	}

	public ProductMinDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		quantity = entity.getQuantity();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Double getQuantity() {
		return quantity;
	}
	
	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
