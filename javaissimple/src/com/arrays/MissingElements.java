package com.arrays;

import java.util.Scanner;

public class MissingElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array range: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		System.out.println("enter"+num+" array elements");
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
for(int i=0;i<arr.length-1;i++) {
	int start=arr[i];
	int end=arr[i+1];
	if(start==end) {
		continue;
	}
if(start<end) {
	for(int j=start+1;j<end;j++) {
	System.out.println(j);
	}
}
}
sc.close();
	}

}
