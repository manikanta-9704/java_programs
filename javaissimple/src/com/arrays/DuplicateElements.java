package com.arrays;

import java.util.Scanner;

public class DuplicateElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int num=sc.nextInt();
		int[]arr= new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
for(int i=0;i<arr.length-1;i++) {
	boolean status=false;
	for(int k=0;k<i;k++) {
		if(arr[i]==arr[k]) {
			status=true;
			break;
		}
		if(status) {
			continue;
		}
	}
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			count++;
break;
		}
	}
}
System.out.println(count);
sc.close();
	}

}
