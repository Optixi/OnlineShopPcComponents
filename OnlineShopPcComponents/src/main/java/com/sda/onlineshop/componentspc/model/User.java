package com.sda.onlineshop.componentspc.model;

import com.sda.onlineshop.componentspc.model.constant.UserRole;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @NotNull(message = " email must be not null")
    @NotBlank(message = "email must be not blank")
    @Email
    @Column(name = "email")
    private String email;
    @NotNull(message = "password must be not null")
    @NotBlank(message = "password must be not blank")
    @Column(name ="password")
    private String password;
    @NotNull(message = "PhoneNumber must be not null")
    @NotEmpty(message = "PhoneNumber must be not empty")
    @Column(name = "phone_number")
    private String phoneNumber;
    @NotNull
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    @OneToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;

    public User() {
    }

    public User(String email, String password, String phoneNumber, UserRole userRole) {
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.userRole = userRole;

    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public UserProfile getUserProfile() {
        return userProfile;
    }

    public void setClientProfile(UserProfile userProfile) {
        this.userProfile = userProfile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", role=" + userRole +
                ", clientProfile=" + userProfile +
                '}';
    }
}
