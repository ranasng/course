package com.restcourse.course.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restcourse.course.entity.Courses;
@Service
public class CourseServiceimpl implements CourseService{
	List<Courses> list; 
	public CourseServiceimpl() {	
		list=new ArrayList<>();
		list.add(new Courses(145,"Java Course","This is A java Course"));
		list.add(new Courses(9030,"Spring Course","This is A Spring Course"));
	}

	@Override
	public List<Courses> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {
		// TODO Auto-generated method stub
		Courses c=null;
		for(Courses course:list) {
			if(course.getCourseId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
		// TODO Auto-generated method stub
		
		return course;
	}
	

}
