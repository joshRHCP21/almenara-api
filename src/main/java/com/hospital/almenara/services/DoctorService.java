package com.hospital.almenara.services;

import com.hospital.almenara.entity.Doctor;
import com.hospital.almenara.repository.DoctorRepository;
import com.hospital.almenara.view.pdf.DoctorPdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository repository;

    public List<Doctor> findAll(){
        return repository.findAll();
    }

    public Doctor findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Doctor create(Doctor doctor){
        return repository.save(doctor);
    }

    public List<Doctor> findAllByTeamId(Long teamId){
        return repository.findAllByTeamId(teamId);
    }

    public Doctor update(Doctor doctor, Long id){
        Doctor updObj = findById(id);
        if (updObj == null) return null;
        if (doctor.getDocument() != null) updObj.setDocument(doctor.getDocument());
        if (doctor.getName() != null) updObj.setName(doctor.getName());
        if (doctor.getPaternalSurname() != null) updObj.setPaternalSurname(doctor.getPaternalSurname());
        if (doctor.getMaternalSurname() != null) updObj.setMaternalSurname(doctor.getMaternalSurname());
        if (doctor.getSchoolAgreement() != null) updObj.setSchoolAgreement(doctor.getSchoolAgreement());
        if (doctor.getSpecialty() != null) updObj.setSpecialty(doctor.getSpecialty());
        if (doctor.getPlaza() != null) updObj.setPlaza(doctor.getPlaza());
        if (doctor.getCampus() != null) updObj.setCampus(doctor.getCampus());
        if (doctor.getBirthDate() != null) updObj.setBirthDate(doctor.getBirthDate());
        if (doctor.getAddress() != null) updObj.setAddress(doctor.getAddress());
        if (doctor.getCmp() != null) updObj.setCmp(doctor.getCmp());
        if (doctor.getEmail() != null) updObj.setEmail(doctor.getEmail());
        if (doctor.getPhone() != null) updObj.setPhone(doctor.getPhone());
        if (doctor.getStatus() != null) updObj.setStatus(doctor.getStatus());
        if (doctor.getTeam() != null) updObj.setTeam(doctor.getTeam());
        if (doctor.getNivel() != null) updObj.setNivel(doctor.getNivel());
        return repository.save(updObj);
    }

    public ByteArrayOutputStream getListDoctorsPdf() {
        List<Doctor> doctors = findAll();
        DoctorPdf studentPdf = new DoctorPdf();
        return studentPdf.getListDoctors(doctors);
    }
}
