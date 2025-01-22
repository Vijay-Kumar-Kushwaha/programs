package com.collections;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

class Demo1 implements Comparator<Employee22>{
	@Override
	public int compare(Employee22 e1, Employee22 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		return id1.compareTo(id2);
	}
}
class Demo2 implements Comparator<Employee22>{
	@Override
	public int compare(Employee22 e1, Employee22 e2) {
		Integer id1 = e1.getId();
		Integer id2 = e2.getId();
		return -1*(id1.compareTo(id2));
	}
}
class Demo3 implements Comparator<Employee22>{
	@Override
	public int compare(Employee22 e1, Employee22 e2) {
		String name1 = e1.getName();
		String name2 = e2.getName();
		return name1.compareTo(name2);
	}
}
class Demo4 implements Comparator<Employee22>{
	@Override
	public int compare(Employee22 e1, Employee22 e2) {
		String email1 = e1.getEmail();
		String email2 = e2.getEmail();
		return email1.compareTo(email2);
	}
}
class Demo5 implements Comparator<Employee22>{
	@Override
	public int compare(Employee22 e1, Employee22 e2) {
		String dept1 = e1.getDepartment();
		String dept2 = e2.getDepartment();
		return dept1.compareTo(dept2);
	}
}
class Demo6 implements Comparator<Employee22>{
	@Override
	public int compare(Employee22 e1, Employee22 e2) {
		Integer salary1 = e1.getSalary();
		Integer salary2 = e2.getSalary();
		return salary1.compareTo(salary2);
	}
}
class Employee22{
	private int id;
	private String name;
	private String email;
	private String department;
	private int salary;
	
	public Employee22() {
		
	}
	
	public Employee22(int id, String name, String email, String department, int salary) {
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
}

public class ComparaterImplementationWithTreeSet {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		Demo3 d3 = new Demo3();
		Demo4 d4 = new Demo4();
		Demo5 d5 = new Demo5();
		Demo6 d6 = new Demo6();
		
		System.out.println("Sort based on\n1. Id(low to high\n2. Id(high to low\n3. Name\n4. Email\n5. Department\n6. Salary)");
		int option = scan.nextInt();
		TreeSet<Employee22> ts = null;
		switch(option) {
			case 1: ts = new TreeSet<Employee22>(d1); 
				break;
			case 2: ts = new TreeSet<Employee22>(d2); 
				break;
			case 3: ts = new TreeSet<Employee22>(d3); 
				break;
			case 4: ts = new TreeSet<Employee22>(d4); 
				break;
			case 5: ts = new TreeSet<Employee22>(d5); 
				break;
			case 6: ts = new TreeSet<Employee22>(d6); 
				break;
			default: System.out.println("Invalid input");
				break;
		}
		System.out.println("Enter the number of Employees");
		int n = scan.nextInt();
		scan.nextLine();
		for(int i = 0; i<n; i++) {
			Employee22 e = new Employee22();
			System.out.println("Enter the details for the "+(i+1)+" employee");
			String details  = scan.nextLine();
			String[] arr = details.split(",");
			e.setId(Integer.parseInt(arr[0]));
			e.setName(arr[1]);
			e.setEmail(arr[2]);
			e.setDepartment(arr[3]);
			e.setSalary(Integer.parseInt(arr[4]));
			ts.add(e);
		}
		System.out.println(ts);
		
	}
}
