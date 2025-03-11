package com.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//@FunctionalInterface
//interface MRDemoInterface{
//	
//}
public class MethodReferencee {
	public static void main(String[] args) {

	LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    LocalDateTime dateTime = LocalDateTime.now();
    int dd = date.getDayOfMonth();
    System.out.println(dd);
    
    System.out.println("Current Date: " + date);
    System.out.println("Current Time: " + time);
    System.out.println("Current DateTime: " + dateTime);
}
}