package ifelse;

import java.util.Scanner;

public class RemoveLastTwoDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		if(n>99) {
			
			System.out.println(n/100);
		}
		else
			System.err.println("Enter number greater than 99");
	}

}
