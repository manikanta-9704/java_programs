package com.POC;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter user name:");
		String name=sc.nextLine();
		System.out.print("enter password:");
		String password=sc.nextLine();
		Login user1=new Login();
		user1.login(name,password);
		System.out.println("1.chack balance");
		System.out.println("2.withdraw");
		System.out.println("3.deposit");
		System.out.println("4.mini statement");
		System.out.println("5.exit");
		System.out.print("select your service:");
		int choice=sc.nextInt();
		UserService s=new UserService();
		s.service(choice);
		
		
		sc.close();

	}

}
