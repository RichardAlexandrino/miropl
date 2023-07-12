package com.miropl.mirolp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miropl.mirolp.dot.ProductDTO;
import com.miropl.mirolp.dot.ProductMinDTO;
import com.miropl.mirolp.service.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		return productService.findById(id);
	}
	
	@GetMapping
	public List<ProductMinDTO> findAll() {
		return productService.findAll();
	}
	
}
