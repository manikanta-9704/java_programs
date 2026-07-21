package com.labtasks;
import java.util.Scanner;

public class Task16 {
/*1.Loan Interest
Scenario: A bank wants to calculate the simple interest for a customer.
2.Create a method calculateInterest(double principal, double rate, int time) that returns the simple interest.
3.Read the principal amount, rate of interest, and time using Scanner.
4.Call the method and display the simple interest.
5.Formula Used:
Simple Interest = (Principal × Rate × Time) / 100*/
	Scanner sc = new Scanner(System.in);
	double calculateIntrest(double principle,double rate,double time){
		return (principle*rate*time)/100;
		
	}
	void main(String[] args) {
		System.out.println("enter the amount:");
		double amount = sc.nextDouble();
		System.out.println("enter rate of intrest:");
		double rate = sc.nextDouble();
		System.out.println("enter time:");
		int time=sc.nextInt();
		double totalAmount=calculateIntrest(amount,rate,time);
		System.out.println("simple intrest:"+totalAmount);
		

	}

}
