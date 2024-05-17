package com.ucc.crudservice.repositories;

import com.ucc.crudservice.model.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
// interfaz
public interface ProductRepository extends JpaRepository<Product, Long> {
}