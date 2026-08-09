package com.practice;



//import java.util.Scanner;
public class Recursion1 {
//	Print numbers from 1 to N
//
//	Input: 5
//	Output: 1 2 3 4 5
	static void display(int n) {
		if(n==0) {
			System.out.println(n);;
		}
		display(n-1);
		System.out.println(n-1);
		
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter number");
//		int s=sc.nextInt();
		display(5);

	}

}
