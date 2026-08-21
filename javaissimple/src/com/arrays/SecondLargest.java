package com.arrays;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int num=sc.nextInt();
		int[]arr= new int[num];
		System.out.println("enter array elements:");
		 for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
		int largest=Integer.MIN_VALUE;
		int secondlarge=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				secondlarge=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlarge&&arr[i]!=largest) {
				secondlarge=arr[i];
			}
		}
		System.out.println(secondlarge);
		sc.close();
	}

}
