package com.labtasks;

public class Task5 {
	//1.Create a class named Employee that demonstrates the use of 2 Static Variables, 2 Instance Variables, a Static Block, and an Instance Block.

	

	//1.Create a class Employee.
	/*Declare 2 static variables:
	companyName
	location*/
	static String company_name="karthikpvt";
	static String location="kphb";
	/*3.Declare 2 instance variables:
	employeeName
	salary*/
	String employ_name;
	float salary;
	
		
	
	//4.Use a static block to initialize the static variables.
static{
		
		System.out.println("company name:"+company_name);
		System.out.println("location:"+location);
		
	}
	void show() {
		
		System.out.println("employ name:"+employ_name);
		System.out.println("salary:"+salary);
		Task5 e4 = new Task5();
		//e4.show(); loop leads to console freeze
		
	}
	void display(){
		System.out.println("nothing here");
	}
	public static void main(String[] args) {
		System.out.println("hello");
		
		Task5 e1 = new Task5();
		e1.employ_name="karthik";
		e1.salary=2000000;
		e1.show();
		Task5 e2 = new Task5();
		e2.employ_name="sunil";
		e2.salary=2000001;
		e2.show();
		//System.gc();	
		}
	
	//5.Create two objects of the Employee class.
	//6.Assign different values to the instance variables using object references.
	//7.Display the details of both employees.
}
