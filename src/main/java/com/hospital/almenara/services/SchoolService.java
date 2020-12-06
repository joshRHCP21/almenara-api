package com.hospital.almenara.services;

import com.hospital.almenara.entity.School;
import com.hospital.almenara.repository.SchoolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
    SchoolRepository repository;

    public List<School> findAll(){
        return repository.findAll();
    }

    public School findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public School create(School school){
        return repository.save(school);
    }

    public School update(School school, Long id){
        School updObj = findById(id);
        if (updObj == null) return null;
        if (school.getName() != null) updObj.setName(school.getName());
        if (school.getShortName() != null) updObj.setShortName(school.getShortName());
        if (school.getStatus() != null) updObj.setStatus(school.getStatus());
        return repository.save(updObj);
    }
}
