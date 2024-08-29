package com.example.demo.dto;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;

public class StudentCourseDTO {

        private String student;
        private String course;

        // Getters và Setters
        public String getStudent() {
            return student;
        }

        public void setStudent(String student) {
            this.student = student;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }
    }


