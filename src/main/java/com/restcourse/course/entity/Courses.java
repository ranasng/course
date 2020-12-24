package com.restcourse.course.entity;

public class Courses {
private long courseId;
private String courseTitle;
private String courseDescription;
public Courses(long courseId, String courseTitle, String courseDescription) {
	super();
	this.courseId = courseId;
	this.courseTitle = courseTitle;
	this.courseDescription = courseDescription;
}
public Courses() {
	super();
	// TODO Auto-generated constructor stub
}
public long getCourseId() {
	return courseId;
}
public void setCourseId(long courseId) {
	this.courseId = courseId;
}
public String getCourseTitle() {
	return courseTitle;
}
public void setCourseTitle(String courseTitle) {
	this.courseTitle = courseTitle;
}
public String getCourseDescription() {
	return courseDescription;
}
public void setCourseDescription(String courseDescription) {
	this.courseDescription = courseDescription;
}


}
