package models;

import java.time.LocalDate;

public class Student {
    String name;
    String email;
    LocalDate registrationDate;

    public Student(String name, String email, LocalDate registrationDate) {
        this.name = name;
        this.email = email;
        this.registrationDate = registrationDate;
    }
}
