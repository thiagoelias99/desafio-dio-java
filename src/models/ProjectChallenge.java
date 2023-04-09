package models;

import enuns.LessonTier;
import enuns.LessonType;

public class ProjectChallenge {
    String description;
    Integer courseLoad;
    LessonTier lessonTier;
    LessonType lessonType = LessonType.ProjectChallenge;

    public ProjectChallenge(String description, Integer courseLoad, LessonTier lessonTier) {
        this.description = description;
        this.courseLoad = courseLoad;
        this.lessonTier = lessonTier;
    }
}
