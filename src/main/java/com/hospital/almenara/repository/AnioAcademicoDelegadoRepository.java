package com.hospital.almenara.repository;

import com.hospital.almenara.entity.AnioAcademicoDelegado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnioAcademicoDelegadoRepository extends JpaRepository<AnioAcademicoDelegado, Long> {
}
