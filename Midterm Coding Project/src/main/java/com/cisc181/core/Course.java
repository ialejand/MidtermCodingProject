package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Course extends Person {
	
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	public eMajor geteMajor() {
		return eMajor;
	}
	public void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}
	
	
	

}
