package com.restcourse.course.services;

import java.util.List;
import java.util.Optional;

import com.restcourse.course.entity.Courses;

public interface CourseService {
public List<Courses> getCourses();
public Optional<Courses> getCourse(long courseId);
public Courses addCourse(Courses course);
public Courses updateCourse(Courses course);
public void deleteCourse(long courseId);
}
