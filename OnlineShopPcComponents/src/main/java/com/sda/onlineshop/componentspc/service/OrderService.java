package com.sda.onlineshop.componentspc.service;

import com.sda.onlineshop.componentspc.model.UserProfile;
import com.sda.onlineshop.componentspc.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAllByUserEmail(String email);
    List<Order> findAll();
    Optional<Order> findByIdAndUserProfile(int id, UserProfile userProfile);
    Optional<Order> findById(int id);
    void delete(Order order);
    void update(Order order);
}
