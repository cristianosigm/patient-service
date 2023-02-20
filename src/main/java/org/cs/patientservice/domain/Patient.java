package org.cs.patientservice.domain;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    private Long id;
    private String name;
    private String surname;
    private String address;
    private Date birthdate;
}
