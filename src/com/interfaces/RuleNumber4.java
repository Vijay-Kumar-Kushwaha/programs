package com.interfaces;

interface Rule4{
	void add();
}
class Math implements Rule4{
	@Override
	public void add() {
		System.out.println("Adding");
	}
	void mult() {
		System.out.println("Multiply");
	}
}
public class RuleNumber4 {
	public static void main(String[] args) {
		Math m = new Math();
		Rule4 ref;
		ref = m;
		ref.add();
		((Math)ref).mult();
			
	}

}
