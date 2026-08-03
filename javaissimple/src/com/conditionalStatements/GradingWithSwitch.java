package com.conditionalStatements;
import java.util.Scanner;
public class GradingWithSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter percentage:");
		double percentage=sc.nextInt();
		int result=(int)percentage/10;
		String grade=switch(result) {
		case 10,9->{
			yield "a";
		}
		case 8->{yield "b";}
		case 7->{yield "c";}
		case 6->{yield "d";}
		case 5->{yield "e";}
		default->{yield "f";}
		};
		
System.out.println(grade);
	}

}
