package com.hospital.almenara.repository;

import com.hospital.almenara.entity.Plaza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlazaRepository extends JpaRepository<Plaza,Long> {
}
