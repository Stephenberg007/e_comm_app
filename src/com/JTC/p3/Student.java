package com.JTC.p3;
import java.util.Optional;
import com.JTC.p2.FunctionalInterface;

public class Student  {
private String studentName;
private String studentEmail;
private int studentPhone;
private Optional<Course> course;

public Student() {}

public Student(String studentName, String studentEmail, int studentPhone, Optional<Course> course) {
	super();
	this.studentName = studentName;
	this.studentEmail = studentEmail;
	this.studentPhone = studentPhone;
	this.course = course;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentEmail() {
	return studentEmail;
}

public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}

public long getStudentPhone() {
	return studentPhone;
}

public void setStudentPhone(int studentPhone) {
	this.studentPhone = studentPhone;
}

public Optional<Course> getCourse() {
	return course;
}

public void setCourse(Optional<Course> course) {
	this.course = course;
}

	
}