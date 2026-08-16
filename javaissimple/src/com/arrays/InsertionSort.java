package com.arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int []arr= {10,5,4,2,50,20};
		int count1=0;
		int count2=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				count2++;
			}
			count1++;
		}
		System.out.println(count1);
		System.out.println(count2);
		for(int number:arr) {
			System.out.print(number+" ");
		}

	}

}
