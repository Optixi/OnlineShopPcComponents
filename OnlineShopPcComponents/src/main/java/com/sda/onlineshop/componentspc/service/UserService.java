package com.sda.onlineshop.componentspc.service;

import com.sda.onlineshop.componentspc.model.User;
import com.sda.onlineshop.componentspc.model.constant.UserRole;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface UserService extends UserDetailsService {
    Optional <User> findByEmail(String email);

    void createUser(String email, String password, UserRole role , String phoneNumber);
}
