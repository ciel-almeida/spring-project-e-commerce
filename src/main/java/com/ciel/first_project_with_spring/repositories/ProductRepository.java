package com.ciel.first_project_with_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciel.first_project_with_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
