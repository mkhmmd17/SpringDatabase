package com.melhi.database.DatabaseDemo.model;
import lombok.*;
import java.time.LocalDate;


@Data
@Builder
public class Student {
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    @NonNull
    private String email;
    private int age;
}
