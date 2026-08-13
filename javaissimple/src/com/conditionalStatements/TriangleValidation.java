package com.conditionalStatements;

import java.util.Scanner;

public class TriangleValidation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter side1: ");
		int a=sc.nextInt();
		System.out.print("enter side2: ");
		int b=sc.nextInt();
		System.out.print("enter side3: ");
		int c=sc.nextInt();
		if((a+b)>c&&(b+c)>a&&(c+a)>b) {{
			System.out.println("is a tryangle");
			if(a==b&&b==c) {
				System.out.println("is a equalateral triangle");
				
			}else if(a==b||b==c) {
				System.out.println("is a isoscalas triangle");
			}else if(a!=b&&b!=c&&a!=c) {
				System.out.println("scalene triangle");
			}
		}
			
		}else {
			System.out.println("is not a tryangle");
		}
		sc.close();
		

	}

}
