package com.constructor;

class Bannk{
	private String name;
	private int bal;
	private int accNo;
	public Bannk(String name, int bal, int accNo) {
		this.name = name;
		this.bal = bal;
		this.accNo = accNo;
	}
		
	public String getName() {
		return name;
	}
	public int getBal() {
		return bal;
	}
	public int getAccNo() {
		return accNo;
	}	
}
public class ConstructorThisInstanceVariable {
	public static void main(String[] args) {
	Bannk b = new Bannk("Vijay", 1_00_000, 12312223);
	System.out.println(b.getName());
	System.out.println(b.getBal());
	System.out.println(b.getAccNo());
	}

}
