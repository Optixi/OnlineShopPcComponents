package com.sda.onlineshop.componentspc.repository;

import com.sda.onlineshop.componentspc.model.UserProfile;
import com.sda.onlineshop.componentspc.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface OrderRepository extends JpaRepository<Order,Integer> {

    List<Order> findAllByUserProfile(UserProfile userProfile);
    Optional<Order> findByIdAndUserProfile(int id, UserProfile userProfile);
}
