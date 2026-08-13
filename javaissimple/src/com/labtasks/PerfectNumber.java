package com.labtasks;

import java.util.Scanner;

//sum of its factors is equals to itself
//1.write a java program to print the perfect number between the range 1 to 100.
public class PerfectNumber {
	
	static boolean perfectNumber(int n) {
	int sum=0;
		for(int i=1;i<=n/2;i++) {//For any positive number n, no proper divisor can be greater than n/2.
			if(n%i==0) {
				sum+=i;
			}
		}
		
		return sum==n;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the range:");
		int num=sc.nextInt();
	  System.out.println("perfect numbers range between 1 to"+num+ " is");
		for(int i=1;i<=num;i++) {
			if(perfectNumber(i)) {
			System.out.println(i);
				
			}
		}
		sc.close();
		
	}

}
