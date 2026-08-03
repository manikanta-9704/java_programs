package com.conditionalStatements;
import java.util.Scanner;
//Grade Calculator
//90-100 -> A
//80-89  -> B
//70-79  -> C
//60-69  -> D
//35-59  -> E
//Below 35 -> Fail

public class GradeCalculator {
	void grade(int marks) {
		if(marks>100||marks<0) {
			System.out.println("invalid marks");
		}
		else if(marks>=90) {
			System.out.println("congrats you got a grade: A");
			
		}
		else if(marks>=80) {
			System.out.println("congrats you goy a grade: B");
		}
		else if(marks>=70) {
			System.out.println("you got a grade: C");
			
		}
		else if(marks>=60) {
			System.out.println("you got a grade: D");
		}
		else if(marks>=35) {
			System.out.println("you got a grade: E");
		}
		else if(marks<35) {
			System.out.println("failed");
			System.out.println("better luck next time😊");
			
		}
		
		
	}

	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.print("enter your marks:");
	    int marks=sc.nextInt();
	    grade(marks);
	    

	}

}
