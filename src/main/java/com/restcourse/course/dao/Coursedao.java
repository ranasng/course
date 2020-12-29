package com.restcourse.course.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restcourse.course.entity.Courses;

public interface Coursedao extends JpaRepository<Courses, Long>{

}
