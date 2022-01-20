package com.example.projetsoa.administrator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/administrator")
public record AdministratorController(AdministratorService administratorService) {
    @PostMapping
    public void registerStudent(@RequestBody AdministratorRegistrationRequest administratorRegistrationRequest){
        log.info("new administrator registration {}", administratorRegistrationRequest);
        administratorService.registerAdministrator(administratorRegistrationRequest);
    }
}
