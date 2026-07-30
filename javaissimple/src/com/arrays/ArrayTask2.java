package com.arrays;
import java.util.Scanner;

public class ArrayTask2 {
//	Create a double array.
//
//	Store salaries of 5 employees.
//
//	Print all salaries.

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee count");
		int n=sc.nextInt();
		double salary[]=new double[n];
		System.out.println("enter salaries:");
		for(int i=0;i<salary.length;i++) {
			salary[i]=sc.nextInt();
			
		}
		System.out.println("salaries are");
		for(int i=0;i<salary.length;i++) {
			System.out.print(salary[i]+" ");
			
		}
		

	}

}
