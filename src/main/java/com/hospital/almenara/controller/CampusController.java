package com.hospital.almenara.controller;

import com.hospital.almenara.entity.Campus;
import com.hospital.almenara.services.CampusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/campus")
public class CampusController {

    @Autowired
    CampusService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Campus>> find(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }
}
