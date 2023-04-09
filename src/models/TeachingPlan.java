package models;

import interfaces.ILesson;

import java.time.LocalDate;
import java.util.List;

public class TeachingPlan {
    String description;
    LocalDate endDate;
    private List<Student> subscribed;
    private List<ILesson> lessons;

    public TeachingPlan(String description, LocalDate endDate) {
        this.description = description;
        this.endDate = endDate;
    }

    public void addStudent(Student student){
        subscribed.add(student);
    }

    public void addLesson(ILesson lesson){
        lessons.add(lesson);
    }
}
