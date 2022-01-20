package com.example.projetsoa.administrator;


import org.springframework.stereotype.Service;

@Service
public record AdministratorService() {
    public void registerAdministrator(AdministratorRegistrationRequest request) {
        Administrator admin = Administrator.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .dateOfBirth(request.dateOfBirth())
                .job(request.job())
                .build();
        //check if email valid
        //check if email is not taken
        //store customer in db
    }
}
