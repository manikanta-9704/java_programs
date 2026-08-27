package com.arrays;

//Reverse every even-indexed row.
//Reverse every odd-indexed column.
//Multiply the main diagonal elements by 2.
//Square the anti-diagonal elements.
//Display the final matrix.
public class RowColomTransformation {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int[] nums : arr) {
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int temp;
				int start = 0;
				int end = arr[i].length - 1;
				if (i % 2 == 0) {
					while (start < end) {
						temp = arr[i][start];
						arr[i][start] = arr[i][end];
						arr[i][end] = temp;
						start++;
						end--;
					}
					start = 0;
					end = arr[i].length - 1;
				}
				if (j % 2 == 1) {
					while (start < end) {
						temp = arr[start][j];
						arr[start][j] = arr[end][j];
						arr[end][j] = temp;
						start++;
						end--;
					}

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i][i] *= 2;
			for (int j = 0; j < arr[i].length; j++) {
				if (i + j == arr.length - 1) {
					arr[i][j] *= arr[i][j];
				}
			}
		}
		for (int[] nums : arr) {
			for (int num : nums) {
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}
}
