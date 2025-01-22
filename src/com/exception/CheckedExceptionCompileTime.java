package com.exception;

public class CheckedExceptionCompileTime {
	public static void main(String[] args) {
		for(int i = 65; i <= 69; i++)	{
			System.out.println((char)i);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Thread.sleep(3000);
			}
			catch (Exception e) {
				System.out.println("Exception Hnadled");
			}
		}
	}
}
