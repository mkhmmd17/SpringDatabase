package com.melhi.database.DatabaseDemo.service.impl;
import com.melhi.database.DatabaseDemo.model.Student;
import com.melhi.database.DatabaseDemo.repository.InMemoryStudentDAO;
import com.melhi.database.DatabaseDemo.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class MemoryStudentService implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> finAllStudents() {
        return repository.finAllStudents();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }


}
