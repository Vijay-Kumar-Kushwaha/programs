package com.project1;

import java.util.Scanner;

public class Hcf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		// logic
		int hcf = findHcf(n,m);
		sc.close();
		System.out.println(hcf);
	}
	
	public static int findHcf(int n, int m)	{
		if(m==0)	{
			return n;
		}
		return findHcf(m,n%m);
	}

}
