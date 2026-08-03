package com.labtasks;
import java .util.Scanner;
//1.A movie theater offers three types of tickets:
//1 → Silver (₹200)
//2 → Gold (₹300)
//3 → Platinum (₹500)
//•Write a Java program that:
//•Accepts the ticket type and customer's age as input.
//•Uses a switch statement to determine the ticket type and price.
//•Uses an if statement inside each case to check whether the customer is a senior citizen (age ≥ 60).
//•If the customer is a senior citizen, apply a 10% discount on the ticket price.
//•Display the ticket type and the final ticket price.
public class Task26 {
	double price;
	
	void discount(int age) {
		if(age>60) {
			double discount=(price*10)/100;
			price-=discount;
		}
		
	}

	void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("enter ticket type:");
		int ticket=sc.nextInt();
		System.out.print("enter your age:");
		int age =sc.nextInt();
		switch(ticket) {
		case 1-> {
			price=200;
			discount(age);
			System.out.println("ticket type is silver");
			System.out.println("price is:"+price);
		}
		case 2->{
			price=300;
			discount(age);
			System.out.println("ticket type is gold");
			System.out.println("price is:"+price);
		}
		case 3->{
			price=500;
			discount(age);
			
			System.out.println("ticket type is platinum");
			System.out.println("price is:"+price);
			
			
		}
		default->System.out.println("invalid option");
		}
		
		

	}

}
