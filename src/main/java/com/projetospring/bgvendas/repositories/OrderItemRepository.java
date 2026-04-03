package com.projetospring.bgvendas.repositories;

import com.projetospring.bgvendas.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
