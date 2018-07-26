package com.example.repository;

import com.example.model.Course;
import com.example.model.Major;
import org.springframework.data.repository.CrudRepository;

import javax.security.auth.Subject;
import java.util.ArrayList;

public interface CourseRepository extends CrudRepository<Course, Long> {
//    Course findByCourseName(String course_name);
//    ArrayList<Course> findAllBySubject(Subject subject);
//    ArrayList<Course> findAllBySubject(Major major);
}
