package com.spring.SpringDataJpa.controller;

import com.spring.SpringDataJpa.model.student;
import com.spring.SpringDataJpa.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo repo;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody student s) {
        repo.save(s);
        return "success";
    }
}
