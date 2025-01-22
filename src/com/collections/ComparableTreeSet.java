package com.collections;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

class Employee2 implements  Comparable<Employee2>{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employee2() {
		
	}
	
	public Employee2(int id, String name, String email, String department, int salary) {
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
	public int compareTo(Employee2 e2) {
		Employee2 e1 = this;
		String name1 = e1.name;
		String name2 = e2.name;
		return name1.compareTo(name2);

	}
}

public class ComparableTreeSet {

	public static void main(String[] args) {
		
		TreeSet <Employee2> al = new TreeSet<Employee2>();
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i<n; i++) {
			Employee2 e = new Employee2();
			System.out.println("Enter the details for the "+(i+1)+" employee");
			String details  = scan.nextLine();
			String[] arr = details.split(",");
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			al.add(e);
		}
		System.out.println(al);
		
	}
}
