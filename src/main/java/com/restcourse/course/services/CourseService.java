package com.restcourse.course.services;

import java.util.List;

import com.restcourse.course.entity.Courses;

public interface CourseService {
public List<Courses> getCourses();
public Courses getCourse(long courseId);
public Courses addCourse(Courses course);
public Courses updateCourse(Courses course);
}
