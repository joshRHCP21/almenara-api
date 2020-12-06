package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class SchoolAgreement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate subscribed;
    private LocalDate expiration;
    @ManyToOne
    private School school;
    @ManyToOne
    private City city;
}
