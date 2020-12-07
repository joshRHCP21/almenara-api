package com.hospital.almenara.controller;

import com.hospital.almenara.entity.SchoolAgreement;
import com.hospital.almenara.services.SchoolAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/schools-agreements")
public class SchoolAgreementController {

    @Autowired
    SchoolAgreementService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN') OR hasRole('USER')")
    public List<SchoolAgreement> find(){
        return service.findAll();
    }


}
