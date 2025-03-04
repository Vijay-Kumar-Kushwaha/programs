/*Given an integer value.
 * Write a program to check whether given number is Prime or not
 * This is Approach 1st*/

/*using ternary operator to reduce the number of operator
 * 		String res = count==2 ? "Prime": "Not Prime";
		System.out.println(res);
*/


package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberApproach1 {	
	static void checkPrime(int n) {
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println("Prime");			
		}
		else {
			System.out.println("Not Prime");
		}
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		checkPrime(n);
		sc.close();
	}
}
