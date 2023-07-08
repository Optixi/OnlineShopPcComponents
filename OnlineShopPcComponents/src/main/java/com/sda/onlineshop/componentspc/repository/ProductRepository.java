package com.sda.onlineshop.componentspc.repository;

import com.sda.onlineshop.componentspc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
