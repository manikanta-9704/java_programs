package com.practice.methods;

public class DemoClass {
	 int id;
	    String name;
	    double salary;
	    String department;
	    DemoClass(){
	    	salary=25000;
	    	department="training";
	    }

	    DemoClass(int id,
	             String name) {
	    	this();

	        this.id = id;
	        this.name = name;
	    }

	    void display() {

	        System.out.println("-----------------------");
	        System.out.println("ID         : " + id);
	        System.out.println("Name       : " + name);
	        System.out.println("Salary     : " + salary);
	        System.out.println("Department : " + department);
	    }

	public static void main(String[] args) {
		DemoClass d=new DemoClass(101,"mani");
		d.display();

	}

}
