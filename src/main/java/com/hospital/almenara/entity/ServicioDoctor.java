package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class ServicioDoctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Doctor doctor;
    @ManyToOne
    private Periodo periodo;
    @OneToMany
    private List<AnioAcademicoDelegado> anioAcademicoDelegados;
}
