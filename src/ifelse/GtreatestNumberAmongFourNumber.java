package ifelse;

import java.util.Scanner;

public class GtreatestNumberAmongFourNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
//		int d = sc.nextInt();
		sc.close();
		int max1 = a > b ? a : b;
		int max2 = c > max1 ? c : max1;
		int res = max1 > max2 ? max1 : max2;
		System.out.println(res);
	}
}
