package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
