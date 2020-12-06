package com.hospital.almenara.repository;

import com.hospital.almenara.entity.SchoolAgreement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolAgreementRepository extends JpaRepository<SchoolAgreement,Long> {
}
