package com.arrays;

import java.util.Scanner;

//Find the second smallest element.
public class SecondSmallest {
static void secondSmallest(int[]arr) {
	int smallest=Integer.MAX_VALUE;
	int secondSmallest=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<smallest) {
			secondSmallest=smallest;
			smallest=arr[i];
		}else if(arr[i]<secondSmallest&&arr[i]!=smallest) {
			secondSmallest=arr[i];
		}
	}
	System.out.println(secondSmallest);
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int num = sc.nextInt();
		int[] arr = new int[num];
		System.out.println("enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		secondSmallest(arr);
		sc.close();
	}
}
