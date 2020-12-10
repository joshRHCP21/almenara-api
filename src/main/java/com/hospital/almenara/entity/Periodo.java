package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Periodo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String anioInicio;
    private String anioFinal;
    private String mesInicio;
    private String mesFinal;
    @OneToMany
    private List<AnioAcademico> anioAcademicos;
}
