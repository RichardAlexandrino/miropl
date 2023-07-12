package com.miropl.mirolp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.miropl.mirolp.entities.Product;
import com.miropl.mirolp.projections.ProductMinProjection;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query(nativeQuery = true, value = """
			SELECT tb_product.id, tb_product.name, tb_product.quantity, tb_product.price, tb_product.img_url AS imgUrl,
				tb_product.short_description AS shortDescription, tb_belonging.position
			FROM tb_product
			INNER JOIN tb_belonging ON tb_product.id = tb_belonging.product_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position;
				""")
	List<ProductMinProjection> searchByList(Long listId);
}
