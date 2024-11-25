package com.JTC.p3;
import java.util.*;


public class DataUtil {
	public static List<Student> getStudentList(){
		List<Student> studentList = new ArrayList<>();
		Student stu1 = new Student(101,"Som",555,"DevOps",15000,0);
		Student stu2 = new Student(102,"Rai",333,"MicroServices",15000,3000);
		Student stu3 = new Student(103,"Aman",777,"Microoosssee",19000,0);
		Student stu4 = new Student(104,"Anuj",222,"DevOps",22000,1200);
		Student stu5 = new Student(105,"Hello",111,"Devops",16000,12);
		Student stu6 = new Student(106,"Sumit",666,"SpringBoot",25000,5000);
		Student stu7 = new Student(107,"Ankit",888,"SalesForce",118000,321);
		Student stu8 = new Student(108,"Sonu",9897,"Hibernate",16000,0);
		Student stu9 = new Student(109,"Mistry",9756,"SalesForce",18000,0);
		
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		studentList.add(stu7);
		studentList.add(stu8);
		studentList.add(stu9);
				
		return studentList;
	}
}
