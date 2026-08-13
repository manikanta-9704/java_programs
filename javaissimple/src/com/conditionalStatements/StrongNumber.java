package com.conditionalStatements;

import java.util.Scanner;

/*1! + 4! + 5!
= 1 + 24 + 120
= 145*/
public class StrongNumber {
	static boolean isStrongNum(int n) {
		int temp = n;
		int sum = 0;
		boolean flag = false;
		int factorial = 1;
		while (temp > 0) {
			int r = temp % 10;
			for (int i = 1; i <= r; i++) {
				factorial = factorial*i;
			}
			System.out.println(factorial);
			sum += factorial;
			factorial=1;
			temp/=10;
		}
		if (sum == n) {
			flag = true;
		}

		return flag;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		if (isStrongNum(num)) {
			System.out.println(num+"is a strong number");

		}else {
			System.out.println(num+" is not a strong number");
		}
		sc.close();
	}

}
