package com.hospital.almenara.services;

import com.hospital.almenara.entity.Plaza;
import com.hospital.almenara.repository.PlazaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlazaService {

    @Autowired
    PlazaRepository repository;

    public List<Plaza> findAll(){
        return repository.findAll();
    }
}
