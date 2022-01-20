package com.example.projetsoa.student;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class Student {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private Date dateOfBirth;
    private String universityLevel;
}
