package com.practice.constructor;
//Loan Eligibility System
//Fields:
//customerId
//name
//salary
//loanAmount
//loanApproved
//Steps:
//Create customer.
//Copy customer.
//If salary ≥ 50000
//loanApproved = true
//
//Otherwise
//
//loanApproved = false
//
//Original object must not change.

public class Loan {
	int customerId;
	String name;
	double salary;
	double loanAmount;
	boolean loanApproved=false;
	Loan(int customerId,String name,double salary,double loanAmount){
		this.customerId=customerId;
		this.name=name;
		this.salary=salary;
		this.loanAmount=loanAmount;
	}
	Loan(Loan l){
//		
		this(0,"null",0.0,0.0);
		
	}
	void calculate() {
		if(salary>50000) {
			loanApproved=true;
			if(loanApproved) {
				System.out.println("loan approved");
			}
		}
		else {
			System.out.println("loan rejected");
		}
	}

	public static void main(String[] args) {
		Loan customer1=new Loan(101,"A",50000,1000000);
		customer1.calculate();
		Loan updatedcustomer1=new Loan(customer1);
		updatedcustomer1.salary=60000;
		updatedcustomer1.calculate();
		customer1.calculate();

	}

}
