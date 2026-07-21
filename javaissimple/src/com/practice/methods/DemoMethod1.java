package com.practice.methods;
import java.util.Scanner;

public class DemoMethod1 {
	Scanner sc=new Scanner(System.in);
	double gst(double tax) {
		return tax;
	}
	double price(double amount) {
		return amount;
	}
	double discount(double discount,double price) {
		discount =(price/100)*discount;
		return discount;
		
	}
	

	void main(String[] args) {
	System.out.println("GST is :");
	double gst=sc.nextFloat();
	double tax=gst(gst);
	System.out.println("cost of product:");
	int amount =sc.nextInt();
	double price=price(amount);
	System.out.println("product price is:"+price);
	System.out.println("enter discount:");
	int dis=sc.nextInt();
	double discount=discount(dis,price);
	System.out.println("total amount:"+(tax+price-discount));
   

	}

}
