package com.java8.streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApii {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(30);
		al.add(40);
		al.add(56);
		al.add(67);
		al.add(26);
		al.add(93);
		al.add(32);
		System.out.println("Original Array Element "+al);
		
		//to count the results
		long noOfFailedStudent = al.stream().filter(m->m<35).count();
		System.out.println("noOfFailedStudent "+noOfFailedStudent);
		
		//Collect to collect the results
		//filter take filter(predicate)
		List<Integer> even = al.stream().filter(m->m%2==0).collect(Collectors.toList());
		System.out.println("Even Elements from the list "+even);
		
		
		//map(function) it takes function and perform the operation
		List<Integer> addFive = al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("Added 5 to every ArrayList element "+addFive);
		
		List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted List "+sortedList);
		
		//toArray()
		//method to convert stream of objects into array
		Integer[] i1 = al.stream().toArray(Integer[]::new);
		Stream.of(i1).forEach(System.out::println);
		
		Stream<Integer> s = Stream.of(9,99,999,9999,99999);
		s.forEach(System.out::println);
		
		Integer[] i2 = {10,20,30,40,50};
		Stream.of(i2).forEach(System.out::println);
		
		/* 
		 * learn
		 * parallel stream
		 * flat map
		 * reduce
		 * */
	}

}

//stream 
//filter
//map 
//filter
//count
//collector 
//sorted()