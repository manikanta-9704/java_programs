package com.arrays;

public class DiagonalSum2dArray {

	public static void main(String[] args) {
		int [][]arr= {
				{1,2,3},{4,5,6},{4,5,6}
		};
		int sum=0;
		for(int []num:arr) {
			for(int n:num) {
				System.out.print(n+" ");
			}System.out.println();
		}
		System.out.println("diagonal elements are:");
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;) {
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
				break;
			}
		}
		System.out.println();
		System.out.println("sum of diagonal: "+sum);

	}

}
