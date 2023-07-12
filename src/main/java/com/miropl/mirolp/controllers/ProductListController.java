package com.miropl.mirolp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miropl.mirolp.dto.ProductListDTO;
import com.miropl.mirolp.service.ProductListService;

@RestController
@RequestMapping(value = "/lists")
public class ProductListController {

	@Autowired
	private ProductListService productListService;

	@GetMapping
	public List<ProductListDTO> findAll() {
		return productListService.findAll();
	}
	
}
