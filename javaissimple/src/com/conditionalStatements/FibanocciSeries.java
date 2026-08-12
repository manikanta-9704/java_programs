package com.conditionalStatements;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);	
System.out.print("enter range:");
int n=sc.nextInt();
int n1=0;
int n2=1;
int n3;
for(int i=0;i<n;i++) {
	n3=n1+n2;//store in a variable
	//update n1,n2
	n1=n2;
	n2=n3;
	System.out.print(n3+" ");
}
	}

}
