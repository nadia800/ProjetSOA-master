package com.example.projetsoa.student;

import org.springframework.stereotype.Service;

@Service

public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void registerStudent(StudentRegistrationRequest request) {
        Student student = Student.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .dateOfBirth(request.dateOfBirth())
                .universityLevel(request.universityLevel())
                .build();
        //check if email valid
        //check if email is not taken
        //store customer in db
        studentRepository.saveAndFlush(student);
    }

}
