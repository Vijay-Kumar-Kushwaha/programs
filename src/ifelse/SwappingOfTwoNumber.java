package ifelse;

import java.util.Scanner;

public class SwappingOfTwoNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();int b = sc.nextInt();
		System.out.println("Before swapping: \n" + "a is: " + a + "\nb is: " +b );
		int temp = a; a = b; b = temp;
		System.out.println("After swapping: \n" + "a is: " + a + "\nb is: " +b );
		sc.close();
	}
}
/* Alternate method approach is
 * a = a + b;
 * b = a - b;
 * a = a - b; 
 */
