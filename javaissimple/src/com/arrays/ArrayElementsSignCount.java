package com.arrays;

import java.util.Scanner;

//Count positive, negative, and zero elements.
public class ArrayElementsSignCount {
static void count(int[] arr) {
	int positiveCount=0;
	int negativeCount=0;
	int zeroCount=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>0) {
			positiveCount++;
		}
		else if(arr[i]<0) {
			negativeCount++;
		}else {
			zeroCount++;
		}
		
		
	}
	System.out.print("positive elements count: "+positiveCount);
	System.out.println();
	System.out.print("negative elements count: "+negativeCount);
	System.out.println();
	System.out.print("zero elements count: "+zeroCount);
	
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size: ");
		int num=sc.nextInt();
		int [] arr=new int[num];
		System.out.println("enter array elements: ");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		count(arr);
sc.close();
	}

}
