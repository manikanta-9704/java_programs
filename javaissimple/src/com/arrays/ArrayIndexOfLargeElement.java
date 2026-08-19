package com.arrays;

import java.util.Scanner;

public class ArrayIndexOfLargeElement {
static void indexOfLargeElement(int[]arr){
	int max=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(max==arr[i]) {
			System.out.println(i);
			break;
		}
	}
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
		indexOfLargeElement(arr);
sc.close();
	}

}
