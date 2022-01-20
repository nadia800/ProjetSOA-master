package com.example.projetsoa.administrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class AdministratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdministratorApplication.class, args);
        Administrator admin = new Administrator(null, "Nadia", "Talbi", "@gmail.com",new Date(18/12/1997), "hi");
        System.out.println(admin.getFirstName());
    }
}
