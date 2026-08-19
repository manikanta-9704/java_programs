package com.arrays;

import java.util.Scanner;

//Count the number of even elements.
public class ArrayEvenElementsCount {
static void evenElementsOfArray(int[]arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			count++;
		}
	}
	System.out.println(count);
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
		evenElementsOfArray(arr);
		sc.close();

	}

}
