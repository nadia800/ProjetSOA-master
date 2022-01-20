package com.example.projetsoa.administrator;

import java.util.Date;

public record AdministratorRegistrationRequest(
        String firstName,
        String lastName,
        String email,
        Date dateOfBirth,
        String job) {
}
