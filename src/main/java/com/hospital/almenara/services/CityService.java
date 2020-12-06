package com.hospital.almenara.services;

import com.hospital.almenara.entity.City;
import com.hospital.almenara.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    CityRepository repository;

    public List<City> findAll(){
        return repository.findAll();
    }
}
