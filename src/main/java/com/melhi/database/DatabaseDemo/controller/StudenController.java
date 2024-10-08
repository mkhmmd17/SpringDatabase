package com.melhi.database.DatabaseDemo.controller;

import com.melhi.database.DatabaseDemo.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.melhi.database.DatabaseDemo.model.Student;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudenController {

    private final StudentService studentService;


    @GetMapping
    public List<Student> findAllStudents() {
        //todo
        return studentService.finAllStudents();
    }

}
