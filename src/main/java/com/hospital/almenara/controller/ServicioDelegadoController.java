package com.hospital.almenara.controller;

import com.hospital.almenara.entity.ServicioDelegado;
import com.hospital.almenara.repository.ServicioDelegadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/servicio-delegado")
public class ServicioDelegadoController {

    @Autowired
    ServicioDelegadoRepository repository;

    @GetMapping
    public List<ServicioDelegado> find(){
        return repository.findAll();
    }
}
