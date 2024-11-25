package com.JTC.p3;
import java.util.*;
import java.util.stream.Collectors;

public class Mak1 {
public static void main(String[] args) {
	//Trainer trainer1 = new Trainer("Aman Maurya","aman@jtc","12345");
	//Course course1 = new Course("DevOps", (double)15000 ,trainer1);
	Student student1 = new Student("Hello","hello@gmail", 111, null);
	String trainerName = "No Name";
	String trainerEmail = "No Email";
	if(student1!=null) {
		Course mycourse = student1.getCourse();
		if(mycourse!=null) {
			Trainer mytrainer = mycourse.getTrainer();
			if(mytrainer!=null) {
				 trainerName = mytrainer.getTrainerName();
				 trainerEmail = mytrainer.getTrainerEmail();
				String trainerPhone = mytrainer.getTrainerPhone();
			}
		}
	}
	System.out.println(trainerName);
	System.out.println(trainerEmail);
	
}
}
