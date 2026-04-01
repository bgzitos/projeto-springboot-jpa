package com.projetospring.bgvendas.repositories;

import com.projetospring.bgvendas.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
