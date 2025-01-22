/*Given two integer value N and M
 * WAP to print all the Prime Number Between N and M*/

package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberBetweenNandM {
	static void printPrimes(int n, int m) {
		for(int i=n; i<=m; i++) {
			if(checkPrime(i)) {
				System.out.println(i);
			}
		}
	}
	static boolean checkPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		printPrimes(n,m);
		sc.close();
		
	}

}
