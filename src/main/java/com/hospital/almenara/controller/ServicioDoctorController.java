package com.hospital.almenara.controller;

import com.hospital.almenara.entity.ServicioDoctor;
import com.hospital.almenara.services.ServicioDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/servicio-doctor")
public class ServicioDoctorController {

    @Autowired
    ServicioDoctorService service;

    @GetMapping
    public List<ServicioDoctor> find(){
        return service.findAll();
    }

    @GetMapping("/{idSpecialty}")
    public List<ServicioDoctor> find(@PathVariable Long idSpecialty){
        return service.findAllBySpecialty(idSpecialty);
    }

    @GetMapping("/pdf")
    public ResponseEntity<byte[]> getListServicioDoctorPdf() {
        byte[] contents = service.getListServicioDoctorsPdf().toByteArray();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        String filename = "medicosPorServicio.pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<>(contents, headers, HttpStatus.OK);
    }

    @GetMapping("/pdf/{idSpacialty}")
    public ResponseEntity<byte[]> getListServicioDoctorsPdfByIdSpecialty(@PathVariable Long idSpacialty) {
        byte[] contents = service.getListServicioDoctorsPdfByIdSpecialty(idSpacialty).toByteArray();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        String filename = "medicosPorServicio.pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<>(contents, headers, HttpStatus.OK);
    }
}
