package com.example.projetsoa.student;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private StudentService studentService;
    private StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @PostMapping
    public void registerStudent(@RequestBody StudentRegistrationRequest studentRegistrationRequest){
        log.info("new student registration {}", studentRegistrationRequest);
        studentService.registerStudent(studentRegistrationRequest);
    }

    @GetMapping(path = "/all")
    public List<Student> listStudent() {
        return studentRepository.findAll();
    }
}
