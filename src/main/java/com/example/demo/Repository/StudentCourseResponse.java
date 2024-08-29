package com.example.demo.web.rest;

import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;

import java.util.List;

public class StudentCourseResponse {
    private List<Student> students;
    private List<Course> courses;

    public StudentCourseResponse(List<Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
