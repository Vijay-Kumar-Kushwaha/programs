package com.comparable.comparator;


class Employee{
	private int id;
	private String name;
	private String email;
	private String dept;
	private int salary;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String email, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", salary=" + salary;
	}
	
	
	
}
public class Comparablee {
	public static void main(String[] args) {
		Object obj = new Object();
		Employee e1 = new Employee(1, "Hitler", "hitler@gmail.com","Manager",1000000);
		System.out.println(e1);
	}

}
