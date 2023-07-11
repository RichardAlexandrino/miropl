package com.miropl.mirolp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miropl.mirolp.dot.ProductMinDTO;
import com.miropl.mirolp.entities.Product;
import com.miropl.mirolp.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<ProductMinDTO> findAll() {
		List<Product> result = productRepository.findAll();
		return result.stream().map(x -> new ProductMinDTO(x)).toList();
	}
	
}
