package String;

import java.util.Scanner;

public class FetchUniqueCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		fetchUniqueChar(s);
	}

	static void fetchUniqueChar(String s) {
		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(firstOccurred(s, ch, i)) {
				int  count = countOccurrence(s, ch);
				System.out.println(ch + " - " + count);
			}
		}
	}
	static boolean firstOccurred(String s, char ch, int i)	{
		for(int j = 0; j < i; j++)	{
			if(ch == s.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	
	static int countOccurrence(String s, char ch)	{
		int count = 0;
		for(int i = 0; i < s.length(); i++)	{
			if(ch == s.charAt(i)) {
				count++;
			}
		}
		return count;
		
		
	}
}
