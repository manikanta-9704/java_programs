package com.conditionalStatements;
import java.util.Scanner;

public class NumberClassification {
	//Even / Odd
	static boolean evenOdd(int n) {
		boolean flag=false;
		if(n%2==0) {
		flag=true;	
		}
		return flag;
		
	}
	//Prime / Not Prime
	static boolean isPrime(int n) {
		boolean flag=true;
		if(n<1) {
			flag=true;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=true;
			}
		}
		return flag;
		
	}
	//Palindrome / Not Palindrome
	static boolean isPalindrome(int n) {
		//formula -->reverse*10+reminder
		int reverse=0;
		int r=0;
	boolean flag=false;
	int temp=n;
	while(temp>0) {
		r=temp%10;
		reverse=reverse*10+r;
		temp/=10;
		
	}
	if(reverse==n) {
		flag=true;
	}
	return flag;
	}
	//Armstrong / Not Armstrong
	static boolean isArmstrong(int n) {
		boolean flag=false;
		int temp=n;
		int result=0;
		String digit=Integer.toString(n);
		int pow=digit.length();
		while(temp>0) {
			int r=temp%10;
			result+=Math.powExact(r,pow);
			temp/=10;
		}
		if(result==n) {
			flag=true;
		}
		return flag;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number to check:");
		int num=sc.nextInt();
		if(evenOdd(num)) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		}
		if(!isPrime(num)) {
			System.out.println(num+"is prime number");
		}else {
			System.out.println(num+"is not a prime");
		}
		if(isPalindrome(num)) {
			System.out.println(num+" is a palindrome ");
			
		}else {
			System.out.println(num+" is not a palindrome");
		}
		if(isArmstrong(num)){
			System.out.println(num+" is armstrong number");
		}else {
			System.out.println(num +" is not a armstrong number");
		}
		sc.close();

	}

}
