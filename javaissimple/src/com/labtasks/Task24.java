package com.labtasks;
import java.util.Scanner;

public class Task24 {
	static Scanner sc = new Scanner(System.in);
	void addition() {
		
	}

	public static void main(String[] args) {
		System.out.println("enter number");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		System.out.println("enter operation");
		String operator=sc.next();
		int result=operator.equals("+")?(num1+num2):(num1-num2);
		System.out.println(result);
		



	}

}
