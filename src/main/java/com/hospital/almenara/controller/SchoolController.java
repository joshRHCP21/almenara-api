package com.hospital.almenara.controller;

import com.hospital.almenara.entity.School;
import com.hospital.almenara.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schools")
public class SchoolController {

    @Autowired
    SchoolService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<School> find(){
        return service.findAll();
    }

}
