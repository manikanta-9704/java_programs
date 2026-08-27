package com.arrays;

//1.Write a Java program to perform the following operations on a 3 × 3 integer matrix:
//Reverse the elements of every even-indexed row (rows 0 and 2).
//Multiply every element of the odd-indexed row (row 1) by 2, except the middle element (1,1).
//Square all the elements on the main (left) diagonal.
//Display the modified matrix.
// Input
//1 2 3
//4 5 6
//7 8 9
// Output
//9   2   1
//8  25   12
//9   8  49
public class Array3D {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		for (int i = 0; i < arr.length; i++) {
			int start = 0;
			int end = arr[i].length - 1;
			if (i % 2 == 0) {
				while (start < end) {
					int temp = arr[i][start];
					arr[i][start] = arr[i][end];
					arr[i][end] = temp;
					start++;
					end--;
				}
			} else if (i == 1) {
			
			for (int j = 0; j < arr[i].length; j++) {
				if (j != 1) {
					arr[i][j] *= 2;
				}

			}
		}}
		for (int i = 0; i < arr.length; i++) {

			arr[i][i] *= arr[i][i];
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}