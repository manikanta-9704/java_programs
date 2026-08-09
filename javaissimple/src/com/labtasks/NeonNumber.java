package com.labtasks;
//1.Write a Java program to check whether a given number is a Neon Number.
//A Neon Number is a number where the sum of the digits of its square is equal to the original number.
//Sample Input 1
//Enter a number: 9
//Sample Output 1
//9 is a Neon Number.
//Explanation:
//9² = 81
//8 + 1 = 9
//Sample Input 2
//Enter a number: 10
//Sample Output 2
//10 is not a Neon Number.
//Explanation:
//10² = 100
//1 + 0 + 0 = 1 ≠ 10
import java.util.Scanner;
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		int square=n*n;
	int temp=square;
	 int sum=0;
	 while(temp>0) {
		 int digit=temp%10;
		 sum+=digit;
		 temp=temp/10;
		
		
	 }
		if(sum==n) {
			System.out.println("is neon number");
		}else {
			System.out.println("is not a neon number");
		}
		sc.close();

	}

}
