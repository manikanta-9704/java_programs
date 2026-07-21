package com.labtasks;
import java.util.Scanner;
public class Task15 {
	int m1;
	int m2;
	int m3;
	Scanner sc = new Scanner(System.in);
	void main() {
		student("sasi");
		
			System.out.println("entere m1 marks:");
			m1=sc.nextInt();
			 System.out.println("enter m2 marks:");
			 m2=sc.nextInt();
			 System.out.println("enter m3 marks:");
			  m3=sc.nextInt();
		
	average(m1,m2,m3);
	total(m1,m2,m3);

	}
	void student(String name) {
		System.out.println("student name:"+name);
	}
	
	void total(int m1,int m2,int m3) {
		int total=m1+m2+m3;
		System.out.println("total marks:"+total);
	}
	void average(int m1,int m2,int m3) {
		double avg=(m1+m2+m3)/3;
		System.out.println("average marks:"+avg);
	}

}
