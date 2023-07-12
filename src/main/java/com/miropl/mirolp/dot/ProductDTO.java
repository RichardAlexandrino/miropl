package com.miropl.mirolp.dot;

import org.springframework.beans.BeanUtils;

import com.miropl.mirolp.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private Double quantity;
	private Double price;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;

	public ProductDTO() {
	}
	
	public ProductDTO(Product entity) {
		BeanUtils.copyProperties(entity, this); // Atalho para copiar todos os atributos (somente se todos tiverem o mesmo nome)
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
}