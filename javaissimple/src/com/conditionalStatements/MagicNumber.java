package com.conditionalStatements;

import java.util.Scanner;

public class MagicNumber {
/*  magic number=whose continues  sum of digits is 1 */
	static int isMagicNumber(int n) {
		int temp1=n;
		int sum=0;
		while(temp1>0) {
			int r=temp1%10;
			sum+=r;
			temp1/=10;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int num=100;
		for(int i=1;i<num;i++) {
		int bin=i;
		int sum=isMagicNumber(bin);
		if(sum>9) {
			sum=isMagicNumber(sum);
		}
		if(sum==1|sum==0) {
			System.out.println(i);
		}
		}
		sc.close();
		}
		

	}


