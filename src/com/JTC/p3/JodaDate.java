package com.JTC.p3;

import java.time.*;  
import java.time.format.*;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.time.temporal.ChronoUnit;

public class JodaDate {
	
public static void main(String[] args) {
	Optional<String> myopts = Optional.of("AMAN MAURYA");
	Optional<Optional<Optional<String>>> myopts1 = Optional.of(Optional.of(Optional.ofNullable("Aman")));
	System.out.println(myopts1);
	Optional <Object> myopts2 = myopts1.flatMap(input1->input1.flatMap(input2->input2.map(input3->input3)));
}
}
