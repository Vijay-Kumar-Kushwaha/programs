package String;

import java.util.Scanner;

public class SumNumberPrintCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		 String res =  firstPrintCharacterAndSumInteger(s);
		 System.out.println(res);
	}
	
	static String firstPrintCharacterAndSumInteger(String s) {
		String t = "";
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if((ch >= 'A' && ch<= 'Z' ) || (ch >= 'a' && ch<='z' )) {
				t = t + ch;
			}
			else if(ch >='0' && ch <='9')
			{
				sum = sum + ch-48;
			}			
		}
		return sum==0 ? t : t+sum;
		
	}
}	
