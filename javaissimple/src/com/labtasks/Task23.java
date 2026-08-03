package com.labtasks;
import java.util.Scanner;
//2.Assign a grade based on marks using nested ternary operators.
//Marks >= 90 → A
//Marks >= 75 → B
//Marks >= 60 → C
//Marks >= 40 → D
//Otherwise → Fail

public class Task23 {
	static Scanner sc=new Scanner(System.in);
	

	public static void main(String[] args) {
		
	//1.Check whether a number is positive or negative using the ternary operator.
		System.out.println("enter number");
		int a=sc.nextInt();
		String b=a>=0?("positive"):("negative");
		System.out.println(b);

	}

}
