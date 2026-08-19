package com.conditionalStatements;

import java.util.Scanner;

public class WhileLoop {
//print sum of numbers from given number
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
	    int sum=0;
	    while(n>0) {
	    	int temp=n%10;
	    	n/=10;
	    	sum+=temp;
	    	
	    }
		System.out.println("sum of digits:"+sum);
		sc.close();
	}

}
