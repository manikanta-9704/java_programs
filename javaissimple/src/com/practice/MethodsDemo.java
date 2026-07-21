package com.practice;
import java.util.Scanner;
public class MethodsDemo {
	static Scanner sc=new Scanner(System.in);
	int add(int a, int b) {
		return a+b;
	}
	int square(int number) {
		return number*number;
	}
	boolean isEven(int number) {
		if((number%2)==0) {
			return true;
		}
		return false;
	
	}
int findLargest(int a, int b) {
	if(a>b) {
		return a;
	}
	return b;
}
String reverse(String name) {
	String rev="";
	int i;
	for(i = name.length()-1;i>=0;i--);{
		
		rev = rev+name.charAt(i);
	}
	return rev;
	
}
	double calculateArea(double radius) {
		return Math.PI*radius*radius;
	}

	boolean login(String username,String password) {
		if (username.equals("user123") && password.equals("12345")) {
		return true;}
	return false;
		
	}

	void main(String[] args) {
		MethodsDemo user1 = new MethodsDemo();
		System.out.println("enter username:");
		String user=sc.nextLine();
		System.out.println("enter password:");
		String password=sc.nextLine();
		if(user1.login(user, password)){
		System.out.println("login successful");
		
		}
		else {
			System.out.println("login failed");
		}
		System.out.println("enter values to add");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int addition= add( a,  b);
		System.out.println(addition);
		System.out.println("number to square");
		int num=sc.nextInt();
		square(num);
		System.out.println("enter number to check even");
		int num1=sc.nextInt();
       if(isEven(num1)) {
    	   System.out.println("is even");
       }else {
    	   System.out.println("not a even");
       }
		
		findLargest(a,b);
		System.out.println("enter text");
		String text=sc.nextLine();
		String reverse=reverse(text);
		double rad=calculateArea(num);
		
	
		
	}

}
