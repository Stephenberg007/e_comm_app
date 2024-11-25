package com.JTC.p3;
import java.util.List; 
import java.io.PrintStream;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Optional;

public class Mak2 {
public static void main(String[] args) {
	
	   Trainer trainer = null;
	    Course course = null;
	    Student student = new Student("Hello", "hello@gmail", 111,Optional.ofNullable(course));
	    Optional<Student> mystudent = Optional.ofNullable(student);
	    String name = mystudent.flatMap(mystu->mystu.getCourse().flatMap(mycou->mycou.getTrainer().map(mytra->mytra.getTrainerName()))).orElse("No Name is Provided");
	    String email = mystudent.flatMap(mystu->mystu.getCourse().flatMap(mycou->mycou.getTrainer().map(mytra->mytra.getTrainerEmail()))).orElse("No email; is Proveid");
	    System.out.println(name);
	    System.out.println(email);
	    System.out.println("-----------");
	    double cName = mystudent.flatMap(mystu->mystu.getCourse().map(mycou->mycou.getCoursePrice())).orElse(25000.0);
	    System.out.println(cName);
}
}
