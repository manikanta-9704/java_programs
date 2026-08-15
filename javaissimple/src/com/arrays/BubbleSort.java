package com.arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
         System.out.print("enter range:");
         int count1=0;
         int count2=0;
         boolean flag=false;
         int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++) {
        	 arr[i]=sc.nextInt();
         }
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			flag=true;
				}
				count2++;
			}
			if(!flag) {
				break;
			}
			count1++;
		}
		System.out.println("no.of iterations:"+count1);
		System.out.println("2nd loop"+count2);
		
		for(int array:arr) {
			System.out.print(array+"  ");
		}
		sc.close();
	}

}
