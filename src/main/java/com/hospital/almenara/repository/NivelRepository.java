package com.hospital.almenara.repository;

import com.hospital.almenara.entity.Nivel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelRepository extends JpaRepository<Nivel, Long> {
}
