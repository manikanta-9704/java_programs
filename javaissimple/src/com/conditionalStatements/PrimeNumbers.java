package com.conditionalStatements;
import java.util.Scanner;
public class PrimeNumbers {
	static void primeNumber(int n){
		boolean status=true;
		if(n==0 ||n==1 ) {
			return;
			
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				
				status=false;
				break; //it stops the for loop
			}
			
			}
		if(status) {
			System.out.println(n+"is a prime number");
		}else {
			System.out.println(n+"not a prime number");
			}
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int num=6;
		primeNumber(num);
		
		sc.close();
		

	}

}
