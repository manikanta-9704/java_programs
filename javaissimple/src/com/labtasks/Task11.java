package com.labtasks;

public class Task11 {
	/*1.Write a Java program to store the following employee details in appropriate variables:

	Employee ID
	Employee Grade
	Employee Salary
	Permanent Employee Status
	Employee Experience (in years)
	Working Days
	Phone Number
	Bonus Amount*/
	
	int emp_id;
	char emp_grade;
	double emp_salary;
	byte experiance;
	byte workingdays;
	long ph_no;
	float bonus;
	Task11(int emp_id ,char emp_grade,double emp_salary,byte experiance,byte workingdays,long ph_no,float bonus){
		this.emp_id=emp_id;
		this.emp_grade=emp_grade;
		this.emp_salary=emp_salary;
		this.experiance=experiance;
		this.workingdays=workingdays;
		this.ph_no=ph_no;
		this.bonus=bonus;
		System.out.println("employee id:"+emp_id);
		System.out.println("employee grade:"+emp_grade);
		System.out.println("employee salary:"+emp_salary);
		System.out.println("experiance:"+experiance);
		System.out.println("working days"+workingdays);
		System.out.println("phone no:"+ph_no);
		System.out.println("bonus"+bonus);
	}

	public static void main(String[] args) {
		Task11 e1 = new Task11(101,'A',50000,(byte)4,(byte)5,9859886541L,700);
		System.out.println("-----------------------------");
		Task11 e2 = new Task11(102,'A',60000,(byte)6,(byte)5,9857698698l,800);
		


	}

}
