package com.practice.methods;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Factorial f=new Factorial();
		PrimeNumber p = new PrimeNumber();
		System.out.println("enter number");
		int num=sc.nextInt();
		long factorial=f.factorial(num);
		System.out.println("factorial of"+num+"is:"+factorial);
		if(p.prime(num)) {
			System.out.println("not a prime number");
			
		}else {
		System.out.println("is a prime number");}

	}

}
