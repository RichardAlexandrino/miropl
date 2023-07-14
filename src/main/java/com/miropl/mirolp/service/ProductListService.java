package com.miropl.mirolp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miropl.mirolp.dto.ProductListDTO;
import com.miropl.mirolp.entities.ProductList;
import com.miropl.mirolp.projections.ProductMinProjection;
import com.miropl.mirolp.repositories.ProductListRepository;
import com.miropl.mirolp.repositories.ProductRepository;

import jakarta.transaction.Transactional;

@Service
public class ProductListService {

	@Autowired
	private ProductListRepository productListRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@org.springframework.transaction.annotation.Transactional(readOnly = true)
	public List<ProductListDTO> findAll() {
		List<ProductList> result = productListRepository.findAll();
		return result.stream().map(x -> new ProductListDTO(x)).toList();
	}
	
	@Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {
		List<ProductMinProjection> list = productRepository.searchByList(listId);
		ProductMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;
		
		for (int i = min; i < max; i++) {
			productListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}
}
