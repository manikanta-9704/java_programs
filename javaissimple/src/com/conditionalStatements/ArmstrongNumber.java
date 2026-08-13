package com.conditionalStatements;

import java.util.Scanner;

//sum of its own digits raises by power of its number of digits
public class ArmstrongNumber {
	static boolean armstrongNumber(int power,int num) {
		boolean flag=false;
		int sum=0;
		int temp=num;
		while(temp>0) {
			int r=temp%10;
			temp/=10;
			sum+=Math.powExact(r,power);
		}
		if(sum==num) {
			flag=true;
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter a number:");
		int num = sc.nextInt();
		int digits=0;
		int temp=num;
		while(temp>0) {
			temp/=10;
			digits++;
		}
		if(armstrongNumber(digits,num)) {
			System.out.println("given number is armstrong");
			
		}else {
			System.out.println("not a armstrongnumber");
		}
sc.close();
	}

}
