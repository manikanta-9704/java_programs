package com.labtasks;

import java.util.Scanner;

public class LargestDigitOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("emter a number:");
		int num=sc.nextInt();
		int temp=0;
		int largeNum=0;
		while(num>0) {
			temp=num%10;
			num/=10;
			if(temp>largeNum) {
				largeNum=temp;
				
			}
			
		}
		System.out.println("large digit is: "+largeNum);
sc.close();
	}

}
