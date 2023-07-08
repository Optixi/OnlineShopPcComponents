package com.sda.onlineshop.componentspc.repository;


import com.sda.onlineshop.componentspc.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile,Integer> {

}
