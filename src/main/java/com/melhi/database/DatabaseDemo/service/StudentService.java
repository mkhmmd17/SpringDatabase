package com.melhi.database.DatabaseDemo.service;

import com.melhi.database.DatabaseDemo.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    public List<Student> finAllStudents() {
        return List.of(
                Student.builder().name("John").email("JohnSmith@gmail.com").age(24).build(),
                Student.builder().name("Mark").lastName("White").email("Mark.White@gmail.com").age(19).build(),
                Student.builder().name("Luke").email("skywalher@gmail.com").age(27).build(),
                Student.builder().name("Bob").email("BobVans@gmail.com").age(41).build()
        );
    }
}
