package com.hospital.almenara.services;

import com.hospital.almenara.entity.Campus;
import com.hospital.almenara.repository.CampusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampusService {

    @Autowired
    CampusRepository repository;

    public List<Campus> findAll(){
        return repository.findAll();
    }
}
