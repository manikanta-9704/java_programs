package com.arrays;

import java.util.Scanner;

public class MultipleArraysSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter length of a1: ");
		int n1=sc.nextInt();
		System.out.print("enter length of a2: ");
		int n2=sc.nextInt();
		int[] a1= new int[n1];
		int[] a2= new int[n2];
		System.out.print("enter a1 elements");
		for(int i=0;i<n1;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.print("enter a2 elements:");
		for(int i=0;i<n2;i++) {
			a2[i]=sc.nextInt();
		}
		int maxLength;
		if(a1.length>a2.length) {
			maxLength=a1.length;
		}else {
			maxLength=a2.length;
		}
		int[] b=new int[maxLength];
		for(int i=0;i<maxLength;i++) {
			if(a1.length<=i) {
				b[i]=a2[i];
			}else if(a2.length<=i) {
				b[i]=a1[i];
			}else {
				b[i]=a1[i]+a2[i];
			}
		}
		System.out.print("sum of array indexes is:");
		for(int i=0;i<maxLength;i++) {
			System.out.print(+b[i]+" ");
		}

	}

}
