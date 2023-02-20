package org.cs.patientservice.api.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cs.patientservice.api.dto.PatientDTO;
import org.cs.patientservice.domain.Patient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api(value = "Patients API")
@RequestMapping(value = "/api/patients")
public interface PatientResource {

    @ApiOperation(value = "Persist a Patient", notes = "This method will receive an instance of PatientDTO and will update it if already exists, or create it otherwise.")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity savePatient(@RequestBody PatientDTO patientDTO);

    @ApiOperation(value = "Get a list of Patients", notes = "This method returns a list containing all patients currently in the database.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<PatientDTO> getPatients();

}
