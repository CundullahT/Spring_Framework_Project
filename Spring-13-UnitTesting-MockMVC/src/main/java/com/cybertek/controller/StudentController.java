package com.cybertek.controller;

import com.cybertek.entity.Student;
import com.cybertek.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/data")
    List<Student> getStudent_data() {
        return studentService.getStudent_data();
    }

}
