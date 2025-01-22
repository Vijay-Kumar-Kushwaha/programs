package PrimeNumber;

import java.util.Scanner;

public class AfterTest {
	
	static boolean checkPrime(int i) {
		if(i<=1) {
			return false;
		}
		for(int j=2; j*j<=i; j++) {
			if(i%j==0) {
				return false;
			}		
		}
		return true;		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		boolean isPrime = checkPrime(i);
		System.out.println(isPrime);
		sc.close();
	}
}
