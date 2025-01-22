package factors;

import java.util.Scanner;

public class HighestCommonFactor {
	
	static void findHighestFactor(int N, int M) {		
		int min = N < M ? N : M;
		for(int i = min; i >= 1; i--) {
			if(N % i == 0 && M % i == 0) {
				System.out.println(i);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Highest Common Factor");
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		findHighestFactor(N, M);
	}
}
