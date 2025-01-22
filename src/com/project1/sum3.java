package com.project1;
import java.util.Scanner;


public class sum3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c,sum1=0, sum2=0, sum3=0;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		sum1=a+b;
		sum2=a+c;
		sum3=b+c;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		sc.close();
	}

}
