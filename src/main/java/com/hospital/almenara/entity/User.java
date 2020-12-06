package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String lastName;
    private Boolean status;
    @ManyToMany
    private Set<Role> roles = new HashSet<>();

    @PrePersist
    public void prePersist() {
        status = true;
    }

    public User() {
    }

    public User(String username, String password, String name, String lastName) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
    }
}
