package com.sda.onlineshop.componentspc.service;

import com.sda.onlineshop.componentspc.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> getAll();

    void create(Product product);

    void update(int id, Product product);
    void delete(int id);

    Optional<Product> findById(int id);
}
