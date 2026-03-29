package com.projetospring.bgvendas.repositories;

import com.projetospring.bgvendas.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
