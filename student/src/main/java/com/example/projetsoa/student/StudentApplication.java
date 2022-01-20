package com.example.projetsoa.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
        StudentRepository studentRepository = null;
        Student student = new Student(null, " Nadia ", " talbi","nadia@gmail.com", new Date(18/12/1997),"If5");
        studentRepository.save(student);
        System.out.println(student.getFirstName());
    }
}
