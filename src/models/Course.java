package models;

import enuns.LessonTier;
import enuns.LessonType;
import interfaces.ILesson;

public class Course implements ILesson {
    String description;
    Integer courseLoad;
    LessonTier lessonTier;
    LessonType lessonType = LessonType.Course;

    public Course(String description, Integer courseLoad, LessonTier lessonTier) {
        this.description = description;
        this.courseLoad = courseLoad;
        this.lessonTier = lessonTier;
    }
}
