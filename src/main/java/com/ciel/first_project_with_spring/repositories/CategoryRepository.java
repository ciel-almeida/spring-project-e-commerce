package com.ciel.first_project_with_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciel.first_project_with_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
