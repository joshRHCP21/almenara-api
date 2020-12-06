package com.hospital.almenara.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Data
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String document;
    private String name;
    private String paternalSurname;
    private String maternalSurname;
    @ManyToOne
    private Plaza plaza;
    @ManyToOne
    private Campus campus;
    private LocalDate birthDate;
    private String address;
    private String cmp;
    private String email;
    private String phone;
    @ManyToOne
    private SchoolAgreement schoolAgreement;
    @ManyToOne
    private Specialty specialty;
    private Boolean status;
    private String numGroup;

    @PrePersist
    public void prePersist(){
        status = true;
        numGroup = "01";
    }
}
