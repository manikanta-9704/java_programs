package com.arrays;

public class ReverseDiagonalSum {

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
			for(int j=0;j<arr[i].length;j++) {
				if(i+j==arr.length-1) {
					System.out.print(arr[i][j]+" ");
					sum+=arr[i][j];
				}
			}
		}
		System.out.println();
		System.out.println("sum of diagonal: "+sum);


	}

}
