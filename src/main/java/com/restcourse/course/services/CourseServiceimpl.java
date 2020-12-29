package com.restcourse.course.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restcourse.course.dao.Coursedao;
import com.restcourse.course.entity.Courses;

@Service
public class CourseServiceimpl implements CourseService {
	// List<Courses> list;
	@Autowired
	private Coursedao courseDao;

	public CourseServiceimpl() {
//		list = new ArrayList<>();
//		list.add(new Courses(145, "Java Course", "This is A java Course"));
//		list.add(new Courses(9030, "Spring Course", "This is A Spring Course"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Optional<Courses> getCourse(long courseId) {
		// TODO Auto-generated method stub
		// Courses c = null;
//		for (Courses course : list) {
//			if (course.getCourseId() == courseId) {
//				c = course;
//				break;
//			}
//		}
		return courseDao.findById(courseId);
	}

	@Override
	public Courses addCourse(Courses course) {
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {

//		list.forEach(e -> {
//			if (e.getCourseId() == course.getCourseId()) {
//				e.setCourseTitle(course.getCourseTitle());
//				e.setCourseDescription(course.getCourseDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long courseId) {
		// list = this.list.stream().filter(e -> e.getCourseId() !=
		// courseId).collect(Collectors.toList());
		Courses entity = courseDao.getOne(courseId);

		courseDao.delete(entity);
	}

}
