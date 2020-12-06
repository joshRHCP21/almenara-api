package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String shortName;
    private Boolean status;

    @PrePersist
    public void prePersist(){
        status = true;
    }
}
