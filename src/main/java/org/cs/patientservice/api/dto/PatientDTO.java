package org.cs.patientservice.api.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PatientDTO {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private Date birthdate;
}
