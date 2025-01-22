/*Given an integer value.
 * Write a program to check whether given number is Prime or not
 * This is Approach "2nd"*/
package PrimeNumber;

import java.util.Scanner;

//import java.util.Scanner;

public class PrimeNumberApproach3 {
	static String checkPrime(int n) {
		if(n<=1) {
			return "Not Prime";
		}
		int abc = (int) Math.sqrt(n);
		System.out.println(abc);
		for(int i=2; i<=abc; i++) {
			if(n%i==0) {
				return "Not Prime";
			}
		}
		return "Prime";		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String res = checkPrime(n);
		System.out.println(res);
	}
}