package com.miropl.mirolp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miropl.mirolp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
