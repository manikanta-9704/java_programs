package com.labtasks;
import java.math.BigInteger;
import java.math.BigDecimal;
public class Task13 {
	//1.Create a program to convert a primitive int into an Integer object (Autoboxing) and print both values.
	void Autoboxing() {
		int a=10;
		Integer i=a;
		System.out.println("integer value"+i);
	}
	//Create a program to convert an Integer object into a primitive int (Unboxing) and display the result.
	void unboxing() {
		Integer i=845769846;
		int a=i;
		System.out.println(a);
	}
	void big() {
		BigInteger num=new BigInteger("18983475987593478");
		BigDecimal d=new BigDecimal("3984769837689347.9856");
		String s ="7586768";
		int i =Integer.parseInt(s);
		System.out.println(num);
		System.out.println(d);
		System.out.println(i);
	}

	public static void main(String[] args) {
		Task13 obj1=new Task13();
		obj1.Autoboxing();
		obj1.unboxing();
		obj1.big();
		/*
		3.Write a program to accept a numeric String and convert it into:
		int
		double
		float using wrapper class methods. */
	}

}
