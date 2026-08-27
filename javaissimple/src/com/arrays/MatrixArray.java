package com.arrays;
//1.Write a Java program to read an N × N integer matrix from the user. Replace every even number in the matrix with 0 and every odd number with -1. Display the modified matrix.
//Input
//1 2 3
//4 5 6
//7 8 9
//Output
//-1  0  -1
//0  -1   0
//-1  0  -1
public class MatrixArray {

	public static void main(String[] args) {
		int[][]arr= {{1,2,3},{4,5,6},{7,8,9}};
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[i].length;j++) {
		if(arr[i][j]%2==0) {
			arr[i][j]=0;
		}else {
			arr[i][j]=-1;
		}
	}
}
for(int []nums:arr) {
	for(int num:nums) {
		System.out.print(num+" ");
	}
	System.out.println();
}
	}

}
