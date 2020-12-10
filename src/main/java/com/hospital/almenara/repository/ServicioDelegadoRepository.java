package com.hospital.almenara.repository;

import com.hospital.almenara.entity.ServicioDelegado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioDelegadoRepository extends JpaRepository<ServicioDelegado, Long> {
}
