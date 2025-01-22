package com.constructor;

class Bannkk{
	private String name;
	private int bal;
	private int accNo;
//	public Bannkk(String name, int bal, int accNo) {
//		this.name = name;
//		this.bal = bal;
//		this.accNo = accNo;
//	}
	public void SetBannkk(String name, int bal, int accNo) {
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

public class OneSetterForAllInstanceVariable {

	public static void main(String[] args) {
		Bannkk b = new Bannkk();
		b.SetBannkk("vijay Kushwaha", 1_00_00, 123123232);
		System.out.println("Name: "+b.getName()+"\nBal: "+b.getBal()+"\nAccount No is:z "+b.getAccNo());
	}

}
