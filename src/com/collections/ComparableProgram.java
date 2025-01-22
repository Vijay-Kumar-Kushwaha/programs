package com.collections;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements  Comparable<Employee>{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, String email, String department, int salary) {
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
	@Override
 	public int compareTo(Employee e2) {
	    int idComparison = Integer.compare(this.id, e2.id);
	    if (idComparison == 0) {
	        // If the ids are the same, compare by name
	        return this.name.compareTo(e2.name);
	    }
	    return idComparison;
	}
}

public class ComparableProgram {
	public static void main(String[] args) {
		Employee e1 =new Employee(2, "Virat", "vir@g.com", "it", 1000);
		Employee e2 =new Employee(1, "anu", "anu@g.com", "it", 1000);
		Employee e3 =new Employee(1, "prabhas", "prabhas@g.com", "it", 1000);
		Employee e4 =new Employee(9, "siddhart", "sidd@g.com", "it", 1200);
		Employee e5 =new Employee(9, "raghav", "ragh@g.com", "it", 1500);
		ArrayList <Employee> al = new ArrayList<Employee>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		System.out.print("before sorting");
		System.out.println(al);
		System.out.println("After sorting");
		Collections.sort(al);
		for (Employee e : al) {
            System.out.println(e);
        }
	}
}
