package com.miropl.mirolp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.miropl.mirolp.entities.ProductList;

public interface ProductListRepository extends JpaRepository<ProductList, Long> {

	@Modifying
	@Query(nativeQuery = true, value = "UPDATE tb_belonging SET position = :newPosition WHERE list_id = :listId AND product_id = :productId")
	void updateBelongingPosition(Long listId, Long productId, Integer newPosition);
}
