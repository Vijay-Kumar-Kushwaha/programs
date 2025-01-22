package com.collections;

class Employeee{
	private int id;
	private String name;
	private String email;
	private String dept;
	private int sal;
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
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employeee() {
		super();
	}
	public Employeee(int id, String name, String email, String dept, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dept = dept;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", email=" + email + ", dept=" + dept + ", sal=" + sal;
	}
	
}
public class toString {
	public static void main(String[] args) {
		Employeee e1 = new Employeee();
		Employeee e2 = new Employeee(1, "hitler", "hitler@gmail.coom", "defence",12321);
		
		System.out.println(e1);
		System.out.println(e2);
		
		String s1 = "Tap";
		System.out.println(s1);
		 
		int[] arr = new int[1];
		arr[0] = 100;
		System.out.println(arr);
	}
}
