package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Employee11 implements  Comparable<Employee11>{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employee11() {
		
	}
	
	public Employee11(int id, String name, String email, String department, int salary) {
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
//	//sort on the basis of the salary 
//	@Override
//	public int compareTo(Employee11 e2) {
//		Employee11 e1 = this;
//		Integer name1 = e1.salary;
//		Integer name2 = e2.salary;
//		return name1.compareTo(name2);
//	}
	
	
	
	@Override
	public int compareTo(Employee11 e2) {
		Employee11 e1 = this;
		Integer id1 = e1.id;
		Integer id2 = e2.id;
		
		String name1 = e1.name;
		String name2 = e2.name;
		if(id1==id2 && e1.name.equals(e2.name)) {
			return Integer.compare(e1.salary, e2.salary);
		}
		if(id1==id2) {
			return e1.name.compareTo(e2.name);
		}
		return id1.compareTo(id2);
	}
}

public class ArrayListComparable {

	public static void main(String[] args) {
		
		ArrayList <Employee11> al = new ArrayList<Employee11>();
		System.out.println("Enter the number of Employees");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i<n; i++) {
			Employee11 e = new Employee11();
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
		System.out.println("Before sorting\n"+al);
		Collections.sort(al);
		System.out.println("After sorting\n"+al);
		
	}
}
