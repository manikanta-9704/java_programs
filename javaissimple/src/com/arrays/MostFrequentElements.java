package com.arrays;

import java.util.Scanner;

public class MostFrequentElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int num=sc.nextInt();
		int[]arr= new int[num];
		int maxCount=0;
		 int maxrepeated=arr[0];
		System.out.println("enter array elements:");
		 for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
		 for(int i=0;i<arr.length;i++) {
			 int count=0;
			
			 for(int j=0;j<arr.length;j++) {
				if( arr[i]==arr[j]) {
					count++;
				}
				
			 }
			 if(count>maxCount) {
				 maxCount=count;
				 maxrepeated=arr[i];
			 }
		 }
		 System.out.println(maxrepeated);
		 System.out.println(maxCount);
sc.close();
	}

}
