package com.conditionalStatements;
import java.util.Scanner;
public class VowelCheck {

	public static void main(String[] args) {
		String choice;
		
		Scanner sc=new Scanner(System.in);
		do {
		System.out.print("enter alphabet:");
		char c=sc.next().charAt(0);
		
		switch(c) {
		case 'a','e','i','o','u'->System.out.println("vowel");
		default->System.out.println("consonent");
		}
		System.out.println("do you want to continue");
		choice=sc.next();
		

	}while(choice.equalsIgnoreCase("yes"));
		sc.close();
		System.out.println("exit");
		}

}
