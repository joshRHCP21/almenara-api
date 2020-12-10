package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class AnioAcademicoDelegado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private AnioAcademico anioAcademico;
    @OneToMany
    private List<ServicioDelegado> servicioDelegados;
}
