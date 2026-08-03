package com.conditionalStatements;
import java.util.Scanner;
public class AtmMenu {
//	ATM Menu
//
//	Display
//
//	1. Check Balance
//	2. Withdraw
//	3. Deposit
//	4. Mini Statement
//	5. Exit

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.chack balance");
		System.out.println("2.withdraw");
		System.out.println("3.deposit");
		System.out.println("4.mini statement");
		System.out.println("5.exit");
		System.out.println("select your service:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1->{
			System.out.println("check balance");
			
		}
		case 2->{
			System.out.println("withdraw");
		}
		case 3->{
			System.out.println("deposit");
		}
		case 4->{
			System.out.println("mini statement");
		}
		case 5 ->System.out.println("exit");
		default ->System.out.println("invalid option");
		
		}
		
		

	}

}
