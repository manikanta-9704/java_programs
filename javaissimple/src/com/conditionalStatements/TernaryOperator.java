package com.conditionalStatements;
import java.util.Scanner;

public class TernaryOperator {
	static Scanner sc=new Scanner(System.in);
	void Largenum(){
		System.out.print("enter 1st number:");
		int num1=sc.nextInt();
		System.out.print("enter 2nd number:");
		int num2=sc.nextInt();
		String result=num1>num2?"num1 is greater":"num2 is greater";
		System.out.println("larger number is:"+result);		
	}
	void checkEvenOdd(int num) {
//		Even or Odd
//		Input an integer.
//		Print whether it is even or odd.
		String result=num%2==0?"even":"odd";
		System.out.println("the number is:"+result);
		
	}

 void checkNum(int num) {
//		1. Positive, Negative, or Zero
//	 	Input a number and print:
//	 	Positive
//	 	Negative
//	 	Zero
	 String result=num>=0?"positive":"negative";
		System.out.println("number is:"+result);
 }
	public static void main(String[] args) {
		TernaryOperator t=new TernaryOperator();
		System.out.println("enter number");
		int num=sc.nextInt();
		t.checkNum(num);
		t.checkEvenOdd(num);
		sc.close();
		
		
		

	}

}
