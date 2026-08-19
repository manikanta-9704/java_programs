package com.arrays;

import java.util.Scanner;

public class ArraySum {
	static void sumOfArray(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("sum of array is: "+sum);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("enter array elements:");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		sumOfArray(arr);
		
sc.close();
	}

}
