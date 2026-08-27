package com.arrays;

import java.util.Scanner;

//1.Write a Java program to find all the leader elements in an array of integers.
//A leader element is an element that is greater than all the elements to its right. The last element of the array is always considered a leader.
//Input: 16 17 4 3 5 2
//Output: Leader Elements: 17 5 2
public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of layers: ");
		int n1=sc.nextInt();
		System.out.println("enter no of rows: ");
		int n2=sc.nextInt();
		System.out.println("enter no of columns:");
		int n3=sc.nextInt();
int[][][] arr=new int[n1][n2][n3];
for(int i=0;i<n1;i++) {
	for(int j=0;j<n2;j++){
		for(int k=0;k<n3;k++) {
			arr[i][j][k]=sc.nextInt();
		}
		
	}}
for(int [][]numbers:arr) {
	for(int []nums:numbers) {
		for(int num:nums) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	System.out.println();
}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				for(int k=0;k<n3;k++) {
				System.out.print(arr[i][k][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
		sc.close();
	}

}
