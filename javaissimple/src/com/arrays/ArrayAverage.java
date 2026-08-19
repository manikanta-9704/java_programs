package com.arrays;

import java.util.Scanner;

//find average of an array
public class ArrayAverage {
static void averageOfArray(int[] arr) {
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	int average=sum/arr.length;
	System.out.println("average of an array is:"+average);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int num=sc.nextInt();
		int[] arr=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		averageOfArray(arr);
sc.close();
	}

}
