package com.hospital.almenara.controller;

import com.hospital.almenara.entity.City;
import com.hospital.almenara.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    @Autowired
    CityService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN')")
    public List<City> find(){
        return service.findAll();
    }
}
