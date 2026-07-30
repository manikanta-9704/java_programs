package com.arrays;
import java.util.Scanner;

public class ArrayTask3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of employees");
		int n=sc. nextInt();
		String[] names=new String[n];
		System.out.println("enter employee names");
		for(int i=0;i<names.length;i++) {
			names[i]=sc.nextLine();
			System.out.println("enter employee"+(i+1));
			
		}
		System.out.println("employees are:");
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
			
		}

	}

}
