package com.encapsulation;

class Employee{
	private int id;
	private String name;
	private String email;
	private int Salary;
	private String address;
		
	public Employee() {

	}
	

	public Employee(int id, String name, String email, int salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		Salary = salary;
		this.address = address;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
public class EnClassProgram1 {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setId(1);
		e.setName("Vijay");
		e.setEmail("Vijay@g.com");
		e.setSalary(1_00_000);
		e.setAddress("Ballia");
		System.out.println("id: "+e.getId()+"\nName: "+e.getName()+
							"\nemail: "+e.getEmail()+"\nsalary: "+e.getSalary()+
							"\naddress: "+e.getAddress());
		
		
	}

}
