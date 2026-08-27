package com.arrays;
//1.Write a Java program to find all the leader elements in an array of integers.
//A leader element is an element that is greater than all the elements to its right. The last element of the array is always considered a leader.
//Input: 16 17 4 3 5 2
//Output: Leader Elements: 17 4 5 2
public class LeaderElement {

	public static void main(String[] args) {
	int [] arr= {16,17,4,3,5,1};
	int max=arr[arr.length-1];
	System.out.println(max);
	for(int i=arr.length-1;i>0;i--) {
		if(arr[i]>max) {
			max=arr[i];
			System.out.println(max);
		}
		
	}
//	for(int i=0;i<arr.length;i++) 
//	for(int j=i+1;j<arr.length;){
//		if(arr[i]>arr[j]) {
//			System.out.println(arr[i]);
//			break;
//		}else {break;}
//	}

	}

}
