package com.sda.onlineshop.componentspc.service;

import com.sda.onlineshop.componentspc.model.UserProfile;
import com.sda.onlineshop.componentspc.model.User;
import com.sda.onlineshop.componentspc.model.constant.UserRole;
import com.sda.onlineshop.componentspc.repository.UserProfileRepository;
import com.sda.onlineshop.componentspc.repository.UserRepository;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService {
    private final UserProfileRepository userProfileRepository;
    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public UserServiceImpl(UserProfileRepository userProfileRepository, UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userProfileRepository = userProfileRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void createUser(String email, String password, UserRole role, String phoneNumber) {
        User user = new User(
                email,
                passwordEncoder.encode(password),
                phoneNumber,
                role
        );
        if(role.equals(UserRole.CLIENT)){
            UserProfile userProfile = new UserProfile();
            userProfileRepository.save(userProfile);
            user.setClientProfile(userProfile);
        }
        userRepository.save(user);
    }

    




    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> userOptional = userRepository.findByEmail(email);
        if (userOptional.isEmpty()) {
            throw new UsernameNotFoundException("Wrong username or password");
        }
        User user = userOptional.get();
        return new org.springframework.security.core.userdetails.User(
                email,
                user.getPassword(),
                List.of(new SimpleGrantedAuthority(user.getUserRole().name()))
        );
    }
}

