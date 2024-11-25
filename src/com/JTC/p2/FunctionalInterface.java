package com.JTC.p2;
import java.util.*;        
import java.util.function.*;
import java.util.stream.*;




public class FunctionalInterface {
	public static void main(String[] args)  {
		List<Integer> mylist = Arrays.asList(1,2,1,14,15,16);
		Map<Integer,Long> map = mylist.stream().collect(Collectors.groupingBy(num1->num1*15,Collectors.reducing(0,((num1,num2)->num1+num2)));
		map.forEach((key,value)-> System.out.println("key :- "+key+" Value :- "+value));
		
 	}
	
}
