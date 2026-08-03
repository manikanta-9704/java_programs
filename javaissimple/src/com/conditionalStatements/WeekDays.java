package com.conditionalStatements;
import java.util.Scanner;
public class WeekDays {
//	Accept a number (1–7) and display the corresponding day.
//
//	Example:
//
//	Input: 3
//	Output: Wednesday

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number 1-7:");
		int day=sc.nextInt();
		switch(day) {
		case 1->System.out.println("monday");
		case 2->System.out.println("tuesday");
		case 3->System.out.println("wednesday");
		case 4->System.out.println("thursday");
		case 5->System.out.println("friday");
		case 6->System.out.println("saturday");
		case 7->System.out.println("sunday");
		}

	}

}
