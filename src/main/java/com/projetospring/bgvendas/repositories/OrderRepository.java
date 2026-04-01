package com.projetospring.bgvendas.repositories;

import com.projetospring.bgvendas.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
