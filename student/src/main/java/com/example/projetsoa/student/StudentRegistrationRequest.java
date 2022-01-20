package com.example.projetsoa.student;

import java.util.Date;

public record StudentRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        Date dateOfBirth,
        String universityLevel) {
}
