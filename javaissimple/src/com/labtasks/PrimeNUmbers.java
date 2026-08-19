package com.labtasks;

import java.util.Scanner;

public class PrimeNUmbers {
	static boolean isPrime(int num) {
		boolean flag=true;
		if(num<1) {
			flag=false;
			
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
			
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter range of prime numbers:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(isPrime(i)) {
				System.out.print(" "+i);
			}
			
		}
		sc.close();
	}

	}


