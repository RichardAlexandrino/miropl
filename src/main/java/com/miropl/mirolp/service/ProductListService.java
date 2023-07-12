package com.miropl.mirolp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miropl.mirolp.dto.ProductListDTO;
import com.miropl.mirolp.entities.ProductList;
import com.miropl.mirolp.repositories.ProductListRepository;

@Service
public class ProductListService {

	@Autowired
	private ProductListRepository productListRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<ProductListDTO> findAll() {
		List<ProductList> result = productListRepository.findAll();
		return result.stream().map(x -> new ProductListDTO(x)).toList();
	}
	
}
