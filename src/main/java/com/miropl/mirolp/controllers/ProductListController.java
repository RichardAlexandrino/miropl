package com.miropl.mirolp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miropl.mirolp.dto.ProductListDTO;
import com.miropl.mirolp.dto.ProductMinDTO;
import com.miropl.mirolp.service.ProductListService;
import com.miropl.mirolp.service.ProductService;

@RestController
@RequestMapping(value = "/lists")
public class ProductListController {

	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductListService productListService;

	@GetMapping
	public List<ProductListDTO> findAll() {
		return productListService.findAll();
	}
	
	@GetMapping(value = "/{listId}/products")
	public List<ProductMinDTO> findById(@PathVariable Long listId) {
		return productService.findByList(listId);
	}
	
}
