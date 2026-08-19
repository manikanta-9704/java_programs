package com.arrays;

import java.util.Scanner;

public class ArrayRotation {
	static void reverseArray(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
	}
		}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int start=0;
		int end=arr.length-1;
		Scanner sc=new Scanner(System.in);
		int noOfRotations=sc.nextInt();
		reverseArray(arr,start,end);
		reverseArray(arr,start,noOfRotations-1);
		reverseArray(arr,noOfRotations,end);
		sc.close();

	}

}
