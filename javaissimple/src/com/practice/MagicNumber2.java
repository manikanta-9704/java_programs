package com.practice;

import java.util.Scanner;

public class MagicNumber2 {
static int isMagicNumber(int n) {
	int temp=n;
	int sum =0;
	while(temp>0) {
		int r=temp%10;
		sum+=r;
		temp/=10;
	}
	if(sum>9) {
		sum=isMagicNumber(sum);
	}
	return sum;
}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter number:");
int num=sc.nextInt();
for(int i=2;i<num;i++){
	int sum=isMagicNumber(i);
	if(sum==0||sum==1) {
		System.out.println(i+"  is a magic number");
	}else {
//		System.out.println(i+"  is not a magic number");
	}
	
}
sc.close();
	}

}
