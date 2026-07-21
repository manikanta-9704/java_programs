package com.labtasks;
import java.util.Scanner;
//Create a Java program that reads the employee name and basic salary using the Scanner class.
//Create a method:
//void salarySlip(String employeeName, double basicSalary)
class employeeSalary{
	void salaryslip(int id,
	String name,
	double basicSalary) {
		double HRA=(basicSalary/100)*20;
		double DA=(basicSalary/100)*10;
		double grossSalary=basicSalary+HRA+DA;
		System.out.println("employee id"+id);
		System.out.println("employee name"+name);
		System.out.println("basic salary"+basicSalary);
		System.out.println("HRA:"+HRA);
		System.out.println("DA"+DA);
		System.out.println("gross salary"+grossSalary);
		
	}
}
//Inside the method, calculate and display the following:
//HRA = 20% of the Basic Salary
//DA = 10% of the Basic Salary
//Gross Salary = Basic Salary + HRA + DA

public class Task17 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		employeeSalary e1=new employeeSalary();
		int id=sc.nextInt();
		String name=sc.next();
		double basicSalary=sc.nextDouble();
		e1.salaryslip(id,name,basicSalary);
		
	

	}

}
