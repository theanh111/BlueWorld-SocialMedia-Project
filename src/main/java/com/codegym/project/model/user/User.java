package com.codegym.project.model.user;

import com.codegym.project.model.role.Role;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @NotEmpty(message = "Please input your username!")
//    @Size(min = 5, max = 10, message = "Username's length from 5 to 10 characters")
    private String username;
//    @NotEmpty(message = "Please input your password")
//    @Size(min = 6, message = "Password's length from 5 to 10 characters")
    private String password;
//    @NotEmpty(message = "Please input your email")
    private String email;
    private String phoneNumber;
    private Date birthday;
    private String avatar;
    private String fullName;
    private String address;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles;



}
