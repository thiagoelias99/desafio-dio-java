import enuns.LessonTier;
import models.Course;
import models.TeachingPlan;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* To create some mock data */
        Course course1;
        Course course2;
        Course course3;
        Course course4;
        Course course5;
        Course course6;
        Course course7;

        createMockData();

        TeachingPlan teachingPlan1 = new TeachingPlan(
                "Formação \"Bootcamp TQI Kotlin - Backend Developer\"",
                LocalDate.of(2023,5,20)
        );

        List<Course> courses = Arrays.asList(course1, course2, course3, course4, course5, course6, course7);

        for (Course course : courses) {
            teachingPlan1.addLesson(course);
        }

        private void createMockData() {
            createCourses();
            createProjectChallenges();
            createCodeChallenges();
            createStudents();
        }

        private static void createCourses() {
            course1 = new Course(
                    "Princípios de Agilidade e Desenvolvimento de Software",
                    10,
                    LessonTier.Básico
            );
            course1 = new Course(
                    "Introdução ao Java",
                    8,
                    LessonTier.Básico
            );
            course1 = new Course(
                    "Aprofundando em Java",
                    10,
                    LessonTier.Intermediário
            );
            course1 = new Course(
                    "Introdução ao Kotlin",
                    6,
                    LessonTier.Básico
            );
            course1 = new Course(
                    "Aprofundando em Kotlin",
                    8,
                    LessonTier.Intermediário
            );
            course1 = new Course(
                    "Spring FrameWork",
                    16,
                    LessonTier.Avançado
            );
            course1 = new Course(
                    "Docker",
                    14,
                    LessonTier.Avançado
            );
        }

        private void createStudents() {
        }

        private void createCodeChallenges() {
        }

        private void createProjectChallenges() {

        }

    }





}