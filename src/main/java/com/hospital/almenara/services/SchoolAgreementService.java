package com.hospital.almenara.services;

import com.hospital.almenara.config.exception.NotFoundException;
import com.hospital.almenara.entity.SchoolAgreement;
import com.hospital.almenara.repository.SchoolAgreementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolAgreementService {

    @Autowired
    SchoolAgreementRepository repository;

    public List<SchoolAgreement> findAll(){
        return repository.findAll();
    }

    public SchoolAgreement findById(Long id){
        if (!repository.existsById(id)) throw new NotFoundException("School Agreement does not exist with id " + id);
        return repository.getOne(id);
    }

    public SchoolAgreement create(SchoolAgreement schoolAgreement) {
        return repository.save(schoolAgreement);
    }

    public SchoolAgreement update(SchoolAgreement schoolAgreement, Long id){
        if (!repository.existsById(id)) throw new NotFoundException("School Agreement does not exist with id " + id);
        SchoolAgreement updObj = repository.getOne(id);
        if (schoolAgreement.getCity() != null) updObj.setCity(schoolAgreement.getCity());
        if (schoolAgreement.getSchool() != null) updObj.setSchool(schoolAgreement.getSchool());
        if (schoolAgreement.getSubscribed() != null) updObj.setSubscribed(schoolAgreement.getSubscribed());
        if (schoolAgreement.getExpiration() != null) updObj.setExpiration(schoolAgreement.getExpiration());
        repository.save(updObj);
        return updObj;
    }
}
