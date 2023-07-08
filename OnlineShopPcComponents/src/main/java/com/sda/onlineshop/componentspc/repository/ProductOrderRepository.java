package com.sda.onlineshop.componentspc.repository;


import com.sda.onlineshop.componentspc.model.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductOrderRepository extends JpaRepository<ProductOrder,Integer> {

}
