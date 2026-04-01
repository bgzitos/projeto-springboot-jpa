package com.projetospring.bgvendas.repositories;

import com.projetospring.bgvendas.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
