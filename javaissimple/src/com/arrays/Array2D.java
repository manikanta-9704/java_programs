package com.arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][3];
//		arr[0][0]=1;
//		arr[1][1]=2;
//		arr[2][2]=3;
		System.out.println("enter array elements:");
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		arr[i][j]=sc.nextInt();
	}}
	for(int[] num:arr) {
		for(int num1:num) {
			System.out.print(num1);
		}
		System.out.println();
	}

sc.close();
	}

}
