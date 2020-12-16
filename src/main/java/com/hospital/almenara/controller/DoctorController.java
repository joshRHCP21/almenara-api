package com.hospital.almenara.controller;

import com.hospital.almenara.entity.Doctor;
import com.hospital.almenara.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"http://localhost:3000", "https://hospital-almenara-control-asistencia.netlify.app"})
@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    DoctorService service;

    @GetMapping
    @PreAuthorize("hasRole('ADMIN') OR hasRole('USER')")
    public ResponseEntity<List<Doctor>> find() {
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Doctor> finOne(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PostMapping
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Doctor> create(@RequestBody Doctor doctor){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(doctor));
    }

    @PutMapping("/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<Doctor> update(@RequestBody Doctor doctor, @PathVariable Long id){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.update(doctor, id));
    }

    @GetMapping("/teamId/{teamId}")
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<List<Doctor>> findByTeamId(@PathVariable Long teamId){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAllByTeamId(teamId));
    }

    @GetMapping("/pdf")
    public ResponseEntity<byte[]> getListStudentsPdf() {
        byte[] contents = service.getListDoctorsPdf().toByteArray();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType("application/pdf"));
        String filename = "medicos.pdf";
        headers.setContentDispositionFormData(filename, filename);
        headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
        return new ResponseEntity<>(contents, headers, HttpStatus.OK);
    }
}
