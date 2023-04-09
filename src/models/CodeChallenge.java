package models;

import enuns.LessonTier;
import enuns.LessonType;

public class CodeChallenge {
    String description;
    Integer courseLoad;
    LessonTier lessonTier;
    LessonType lessonType = LessonType.CodeChallenge;

    public CodeChallenge(String description, Integer courseLoad, LessonTier lessonTier) {
        this.description = description;
        this.courseLoad = courseLoad;
        this.lessonTier = lessonTier;
    }
}
