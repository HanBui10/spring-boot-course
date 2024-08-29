package com.example.demo.web.rest;

import com.example.demo.Exception.ResourceNotFoundException;
import com.example.demo.Entity.Course;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.dto.StudentCourseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentCourseController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    // Tạo Student
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // Lấy danh sách tất cả các Students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @PostMapping("/courses")
    public Course createCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @PostMapping("/students/{studentId}/courses/{courseId}")
    public Student enrollCourse(@PathVariable Long studentId, @PathVariable Long courseId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found"));
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found"));
        student.getCourses().add(course);
        return studentRepository.save(student);
    }

    @PostMapping("/student-course")
    public Student enrollStudentAndCourse(@RequestBody StudentCourseDTO dto) {
        Student student = new Student();
        student.setName(dto.getStudent());

        Course course = new Course();
        course.setTitle(dto.getCourse());

        courseRepository.save(course);
        student.getCourses().add(course);

        return studentRepository.save(student);
    }
}
