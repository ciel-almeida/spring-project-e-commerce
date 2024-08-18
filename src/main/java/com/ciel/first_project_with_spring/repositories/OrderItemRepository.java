package com.ciel.first_project_with_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciel.first_project_with_spring.entities.OrderItem;
import com.ciel.first_project_with_spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
