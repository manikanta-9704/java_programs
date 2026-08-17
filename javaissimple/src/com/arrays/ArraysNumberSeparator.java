package com.arrays;

import java.util.Scanner;

public class ArraysNumberSeparator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size:");
		int length=sc.nextInt();
		int[] a=new int[length];
		for(int i=0;i<length;i++) {
			a[i]=sc.nextInt();
			
		}
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				count1++;
			} else if (a[i] > 0) {
				count2++;
			} else if (a[i] == 0) {
				count3++;

			}
		}
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(count3);
		int[] negativeArr = new int[count1];
		int[] positiveArr = new int[count2];
		int[] zeroArr = new int[count3];
		int temp1=0;
		int temp2=0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < 0) {
					negativeArr[i] = a[i];
				}
			}
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
					positiveArr[temp1] = a[i];
					temp1++;
				}
			}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zeroArr[temp2] = a[i];
				temp2++;
			}
			
				

		}
		for (int i = 0; i < negativeArr.length; i++) {
			System.out.print(negativeArr[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < positiveArr.length; i++) {
			System.out.print(positiveArr[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < zeroArr.length; i++) {
			System.out.print(zeroArr[i] + " ");
		}
sc.close();
	}

}
