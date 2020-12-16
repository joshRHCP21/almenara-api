package com.hospital.almenara.services;

import com.hospital.almenara.entity.Nivel;
import com.hospital.almenara.repository.NivelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelService {

    @Autowired
    NivelRepository repository;

    public List<Nivel> findAll(){
        return repository.findAll();
    }
}
