package com.conditionalStatements;
import java.util.Scanner;
public class PrintPrimenumbers {
	static boolean primenum(int n) {
		boolean status=true;
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
		if(n%i==0) {
			status=false;
			break;
		}	
		}
		return status;
	}
			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter range:");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++) {
	if(primenum(i)) {
			System.out.println(i);
	}
		}
		sc.close();
	}

}
