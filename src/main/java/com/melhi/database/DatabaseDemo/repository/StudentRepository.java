package com.melhi.database.DatabaseDemo.repository;

import com.melhi.database.DatabaseDemo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
