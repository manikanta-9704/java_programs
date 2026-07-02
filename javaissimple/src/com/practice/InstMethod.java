package com.practice;

public class InstMethod {
	String holder_name;
	int balance;
	void deposit(double amount) {
		System.out.println("total amount:"+(balance+amount));
		
	}
	class Demo{
		Demo(int a){
			a=20;
		}
	}

	public static void main(String[] args) {
		InstMethod m1 = new InstMethod();
		InstMethod m2 = new InstMethod();
		
		m1.balance=1000;
		m2.balance=5000;
		m1.deposit(110000);
		m2.deposit(100000);
		
	}

}
