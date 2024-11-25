package com.JTC.p3;
import java.util.Optional;
public class Course {
	private String courseName;
	private double CoursePrice;
	private Optional<Trainer> trainer;
	public Course() {}
	public Course(String courseName, double coursePrice, Optional<Trainer> trainer) {
		super();
		this.courseName = courseName;
		this.CoursePrice = coursePrice;
		this.trainer = trainer;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getCoursePrice() {
		return CoursePrice;
	}
	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}
	public Optional<Trainer> getTrainer() {
		return trainer;
	}
	public void setTrainer(Optional<Trainer> trainer) {
		this.trainer = trainer;
	}
	
	
}