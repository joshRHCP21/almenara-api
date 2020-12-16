package com.hospital.almenara.repository;

import com.hospital.almenara.entity.ServicioDoctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioDoctorRepository extends JpaRepository<ServicioDoctor, Long> {
    
    List<ServicioDoctor> findAllByDoctorSpecialtyId(Long specialtyId);
}
