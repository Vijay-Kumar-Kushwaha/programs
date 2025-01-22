package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements  Comparable<Employee1>{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employee1() {
		
	}
	
	public Employee1(int id, String name, String email, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id + " " + name + " " + email + " " + department + " "
				+ salary;
	}

//	//sort on the basis of the id 
//	@Override
//	public int compareTo(Employee1 e2) {
//		Employee1 e1 = this;
//		Integer id1 = e1.id;
//		Integer id2 = e2.id;
//		return id1.compareTo(id2);
//	}
//	//sort on the basis of the name 
//	
	
	//@Override
// 	public int compareTo(Employee1 e2) {
//	    Employee1 e1 = this;
//	    String name1 = e1.name;
//	    String name2 = e2.name;
//	    return name1.compareTo(name2);
//	}
	
	
	//sort on the basis of the salary 
	@Override
	public int compareTo(Employee1 e2) {
		Employee1 e1 = this;
		Integer name1 = e1.salary;
		Integer name2 = e2.salary;
		return name1.compareTo(name2);
	}
}

public class ImplementingComparableInterfaceSorting {

	public static void main(String[] args) {
		Employee1 e1 =new Employee1(2, "Virat", "vir@g.com", "it", 1000);
		Employee1 e2 =new Employee1(1, "anu", "anu@g.com", "it", 1000);
		Employee1 e3 =new Employee1(4, "prabhas", "prabhas@g.com", "it", 1000);
		Employee1 e4 =new Employee1(45, "siddhart", "sidd@g.com", "it", 1200);
		Employee1 e5 =new Employee1(9, "raghav", "ragh@g.com", "it", 1500);
		ArrayList <Employee1> al = new ArrayList<Employee1>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		Collections.sort(al);
		System.out.println(al);
	}
}
