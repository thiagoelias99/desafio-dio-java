package interfaces;

import enuns.LessonTier;
import enuns.LessonType;

public interface ILesson {
    String description = "";
    Integer courseLoad = 0;
    LessonTier lessonTier = LessonTier.Básico;
    LessonType lessonType = LessonType.Course;
}
