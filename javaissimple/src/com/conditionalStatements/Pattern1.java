package com.conditionalStatements;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {//2
			for(int j=0;j<i;j++) {//
				System.out.print("*");
				
			}
			System.out.println();
		}
sc.close();
	}

}
