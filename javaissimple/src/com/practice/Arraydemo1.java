package com.practice;
import java.util.Scanner;

public class Arraydemo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(2);
		System.out.println(c);
		
		int[] arr= {23,45,56,43,33};
		int min=0;
		int max=0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[min]>arr[i]) {
				min=i;
			}
			if(arr[max]<arr[i]) {
				max=i;
			}
		}
	
		
		System.out.println(arr[min]);
		System.out.println(arr[max]);

	}

}
