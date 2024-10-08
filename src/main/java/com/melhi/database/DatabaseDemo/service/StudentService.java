package com.melhi.database.DatabaseDemo.service;
import com.melhi.database.DatabaseDemo.model.Student;
import java.util.List;


public interface StudentService {

    public List<Student> finAllStudents();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteStudent(String email);
}
