package String;

import java.util.Scanner;

public class UpperCaseToLowerCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		toLower(input);
	}
	static void toLower(String input) {
		String t = "";
		for(int i = 0; i < input.length(); i++)	{
			char ch = input.charAt(i);
			if(ch >= 'A' && ch <= 'Z')	{
				t = t + char(ch+32); 
			}
			else
				t = t + ch;
			System.out.println(t);
		}
	}
}
