package com.POC;
import java.util.Scanner;

public class UserService {
	Scanner sc=new Scanner(System.in);
	double amount=5000;
	void service(int choice) {

	
		switch(choice) {
		case 1->{
			System.out.println("balance is"+amount);
			
		}
		case 2->{
			System.out.println("withdraw");
			System.out.print("enter withdrawl ammount:");
			double withdrawAmount=sc.nextDouble();
			if(withdrawAmount<=amount) {
				System.out.println("withdrawl successfull");
				System.out.println("total balance:"+(amount-withdrawAmount));
			}
		}
		case 3->{
			System.out.println("deposit");
			System.out.print("enter deposit ammount:");
			double depositAmount=sc.nextDouble();
			System.out.println("deposit successfull");
			System.out.println("total balance is:"+(depositAmount+amount));
		}
		case 4->{
			System.out.println("mini statement");
			System.out.println("total balance is"+amount);
		}
		case 5 ->System.out.println("exit");
		default ->System.out.println("invalid option");
		
		}
		
	}

}
