package com.cybertek.controller;

import com.cybertek.model.ResponseWrapper;
import com.cybertek.model.Teacher;
import com.cybertek.repository.ParentRepository;
import com.cybertek.repository.StudentRepository;
import com.cybertek.repository.TeacherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ApiController {

    private final TeacherRepository teacherRepository;
    private final StudentRepository studentRepository;
    private final ParentRepository parentRepository;

    public ApiController(TeacherRepository teacherRepository, StudentRepository studentRepository, ParentRepository parentRepository) {
        this.teacherRepository = teacherRepository;
        this.studentRepository = studentRepository;
        this.parentRepository = parentRepository;
    }

    @GetMapping("/teachers")
    public List<Teacher> readAllTeachers(){
        return teacherRepository.findAll();
    }

    @GetMapping("/students")
    public ResponseEntity<ResponseWrapper> readAllStudents(){
        return ResponseEntity.ok(new ResponseWrapper("Students are successfully retrieved", studentRepository.findAll()));
    }

    @GetMapping("/parents")
    public ResponseEntity<ResponseWrapper> readAllParents(){
        ResponseWrapper responseWrapper = new ResponseWrapper(true, "Parents are successfully retrieved",
                HttpStatus.ACCEPTED.value(),
                parentRepository.findAll());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(responseWrapper);
    }

}
