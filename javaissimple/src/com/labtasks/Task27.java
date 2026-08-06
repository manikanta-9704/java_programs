package com.labtasks;
import java.util.Scanner;

public class Task27 {
	
	
//	1.Print the Multiplication Table of a Number
//	Question:
//	Write a Java program to print the multiplication table of a given number from 1 to 10.
//	2.Print Alphabets in Reverse Order
//	Question:
//	Write a Java program to print uppercase alphabets from Z to A using a for loop.
//	Output
//	Z Y X W V U T S R Q P O N M L K J I H G F E D C B A
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number:");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+"*"+i+"="+(num*i));
			  
		}
		int marks=76;
		String result=marks>40?(marks>=60?(marks>75?(marks>90?"a":"b"):"c"):"d"):"f";
		System.out.println(result);
		
	
		
	

	}

}
