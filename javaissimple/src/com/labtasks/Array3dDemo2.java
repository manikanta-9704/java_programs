package com.labtasks;

import java.util.Scanner;

public class Array3dDemo2 {

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
		
	}
	
}
for(int[][]num1:arr) {
	for(int[]num2:num1) {
		for(int num:num2) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	System.out.println("              ");
}
sc.close();
	}

}
