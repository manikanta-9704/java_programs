package com.labtasks;
//Bank Account Management using Constructor Chaining
//Create a class BankAccount with the following overloaded constructors:
//BankAccount()
//BankAccount()
//BankAccount( accountHolder,  accountNumber)
//BankAccount( accountHolder,  accountNumber,  balance)
//Requirements
//1.Use constructor chaining with this().
//2.The final constructor should initialize all instance variables.
//3.Create a display() method to print all account details.
//In the main() method:
//4.Create one object using the default constructor.
//5.Create another object using the constructor with only the account holder's name.
//6.Create another object using the constructor with name and account number.
//7.Create the final object using all three values.
//Display the details of all objects.

public class Task22 {
	String holderName;
	String accountNo;
	double balance;
	Task22(){
		this("unknown","0000",0.0);
		
	}
	Task22(String holderName,String accountNo){
		this(holderName,accountNo,0.0);
		
		
	}
	Task22(String holderName,String accountNo,double balance ){
		this.holderName=holderName;
		this.accountNo=accountNo;
		this.balance=balance;
		
	}
	void display() {
		System.out.println("holder name:"+holderName);
		System.out.println("account number:"+accountNo);
		System.out.println("balance:"+balance);
	}


	public static void main(String[] args) {
		Task22 c1=new Task22("mani","98456978");
		c1.display();
		

	}

}
