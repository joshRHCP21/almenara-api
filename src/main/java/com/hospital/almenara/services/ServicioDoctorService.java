package com.hospital.almenara.services;

import com.hospital.almenara.entity.ServicioDoctor;
import com.hospital.almenara.repository.ServicioDoctorRepository;
import com.hospital.almenara.view.pdf.ServicioDoctorPdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.util.List;

@Service
public class ServicioDoctorService {

    @Autowired
    ServicioDoctorRepository repository;

    public List<ServicioDoctor> findAll(){
        return repository.findAll();
    }

    public List<ServicioDoctor> findAllBySpecialty(Long idSpecialty){
        return repository.findAllByDoctorSpecialtyId(idSpecialty);
    }

    public ByteArrayOutputStream getListServicioDoctorsPdf() {
        List<ServicioDoctor> servicioDoctorList = findAll();
        ServicioDoctorPdf servicioDoctorPdfPdf = new ServicioDoctorPdf();
        return servicioDoctorPdfPdf.getListDoctors(servicioDoctorList);
    }

    public ByteArrayOutputStream getListServicioDoctorsPdfByIdSpecialty(Long idSpecialty){
        List<ServicioDoctor> servicioDoctorList = repository.findAllByDoctorSpecialtyId(idSpecialty);
        ServicioDoctorPdf servicioDoctorPdfPdf = new ServicioDoctorPdf();
        return servicioDoctorPdfPdf.getListDoctors(servicioDoctorList);
    }

}
