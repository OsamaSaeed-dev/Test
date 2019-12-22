package com.journaldev.jaxws.beans;

import java.io.Serializable;

public class Course implements Serializable {

	
	int CourseId;
	String CourseName;
	
	public int getCourseId() {
		return CourseId;
	}
	public void setCourseId(int courseId) {
		CourseId = courseId;
	}
	public String getName() {
		return CourseName;
	}
	public void setName(String name) {
		this.CourseName = name;
	}
	
	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", name=" + CourseName + "]";
	}
	
	
	
	
	
}
