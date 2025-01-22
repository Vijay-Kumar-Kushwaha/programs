package ifelse;

import java.util.Scanner;

public class multiplesOfN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		sc.close();

		multiplesOfTheN(n, x);
	}
	static void multiplesOfTheN(int n, int x) {
		boolean found = false;
		for(int i = n; i <= x; i+=n) {
			if(i % n == 0)	{
				System.out.println(i);
				found = true;
			}
		}
		if(!found) {
			System.out.println("false input");
		}
	}

}
