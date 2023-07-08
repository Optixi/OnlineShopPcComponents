package com.sda.onlineshop.componentspc.service;

import com.sda.onlineshop.componentspc.model.Product;

import java.util.Map;

public interface ShoppingCartService {
    void addProduct(Product product);
    void removeProduct(Product product);
    void clearProducts();
    double totalPrice();
    void checkOut(String userEmail);
    Map<Product,Integer> getAllProducts();
}
