package com.POC;
import java.util.Scanner;

public class UserService {
	Scanner sc=new Scanner(System.in);
	private double amount=5000;
	void service(int choice) {

	switch(choice) {
	case 1->{
		System.out.println("savings account");
		System.out.println("1.chack balance");
		System.out.println("2.withdraw");
		System.out.println("3.deposit");
		System.out.println("4.mini statement");
		System.out.println("5.exit");
		System.out.println("select your service:");
		choice =sc.nextInt();
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
	case 2->{
		System.out.println("current account");
		System.out.println("1.chack balance");
		System.out.println("2.withdraw");
		System.out.println("3.deposit");
		System.out.println("4.mini statement");
		System.out.println("5.exit");
		System.out.println("select your service:");
		choice=sc.nextInt();
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
		
	}default->System.out.println("invalid option");
	}

}
}
