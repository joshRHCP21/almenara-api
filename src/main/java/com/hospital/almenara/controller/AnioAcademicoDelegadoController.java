package com.hospital.almenara.controller;

import com.hospital.almenara.entity.AnioAcademicoDelegado;
import com.hospital.almenara.repository.AnioAcademicoDelegadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/anio-academico-delegado")
public class AnioAcademicoDelegadoController {

    @Autowired
    AnioAcademicoDelegadoRepository repository;

    @GetMapping
    public List<AnioAcademicoDelegado> find(){
        return repository.findAll();
    }
}
