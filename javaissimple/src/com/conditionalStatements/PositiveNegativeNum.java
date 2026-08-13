package com.conditionalStatements;

import java.util.Scanner;

//Input a number and determine whether it is:
//
//	Positive
//	Negative
//	Zero
public class PositiveNegativeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" is positive number");
		}else if(num<0) {
			System.out.println(num+" is negative number");
		}else {
			System.out.println("number is zero");
		}
sc.close();
	}

}
