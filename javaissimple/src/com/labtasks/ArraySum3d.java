package com.labtasks;
//1.Write a Java program to read a 3 × 3 matrix and find the sum of all its elements.
//Input: 1 2 3
//           4 5 6
//           7 8 9
//Output : Sum of all elements = 45
public class ArraySum3d {

	public static void main(String[] args) {
	int [][][] arr= {
			{{1,2,3,4},{5,6,7,8},{6,5,4,3}}
	};
	int sum=0;
	
		for(int[][] number:arr) {
			for(int[] num:number) {
				for(int n:num) {
					sum=sum+n;
					}
			}
			
			
		}
		System.out.print("sum of all elements: "+sum);
	}

}
