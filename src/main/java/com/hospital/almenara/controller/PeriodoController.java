package com.hospital.almenara.controller;

import com.hospital.almenara.entity.Periodo;
import com.hospital.almenara.repository.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/periodo")
public class PeriodoController {

    @Autowired
    PeriodoRepository repository;

    @GetMapping
    public List<Periodo> find(){
        return repository.findAll();
    }
}
