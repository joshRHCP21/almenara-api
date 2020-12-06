package com.hospital.almenara.services;

import com.hospital.almenara.entity.Specialty;
import com.hospital.almenara.repository.SpecialtyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpecialtyService {

    @Autowired
    SpecialtyRepository repository;

    public List<Specialty> findAll(){
        return repository.findAll();
    }
}
