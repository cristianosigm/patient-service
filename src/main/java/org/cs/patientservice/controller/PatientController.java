package org.cs.patientservice.controller;

import org.cs.patientservice.api.dto.PatientDTO;
import org.cs.patientservice.api.resource.PatientResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class PatientController implements PatientResource {

    @Override
    public ResponseEntity savePatient(PatientDTO patientDTO) {
        return ResponseEntity.ok().build();
    }

    @Override
    public List<PatientDTO> getPatients() {
        return Collections.singletonList(PatientDTO.builder().id(Long.valueOf(1L)).name("John Doe").build());
    }
}
