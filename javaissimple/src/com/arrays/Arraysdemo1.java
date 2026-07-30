package com.arrays;
import java.util.Scanner;

public class Arraysdemo1 {
//	Create an integer array of size 5.
//
//	Read marks using Scanner.
//	Store them in the array.
//	Display all marks using a for loop.

	 void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int n = sc.nextInt();
		int [] num=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<num.length;i++) {
			
			num[i]=sc.nextInt();
		}
		System.out.println("numbers are:");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		
		
		
	

	}

}
