package PrimeNumber;

import java.util.Scanner;

/*public class TestPrime {
//	static void printPrime(int N, int M) {
//		int count=0;
//		for(int i=M; count<N; i++) {
//			if(checkPrime(i)) {
//				System.out.println(i+" ");
//				count++;
//			}
//		}
//	}
//	
//	static boolean checkPrime(int i) {
//		if(i<=1) {
//			return false;
//		}
//		for(int j=2; j<=i; j++) {
//			if(i%j==0) {
//				return false;
//			}		
//		}
//		return true;		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		int M = sc.nextInt();
//		System.out.println("Hello ji!");
		System.out.println(N/2);
		sc.close();

	}

}

*/
public class TestPrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0; i < arr.length; i++)	{
			arr[i] = sc.nextInt();
		}
		indexOfLargest(arr);
		sc.close();
		
	}
	public static void indexOfLargest(int[] arr)	{
		int max = arr[0];
		for(int i = 1; i < arr.length; i++)	{
			if(arr[i] > arr[0])	{
				arr[0] = arr[i];
			}
		}
		System.out.println(i);
	}
}







