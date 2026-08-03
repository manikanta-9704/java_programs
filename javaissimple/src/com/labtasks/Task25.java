package com.labtasks;
import java.util.Scanner;
public class Task25 {
	void main() {
		String name="lucky", surname="moyya";
		System.out.println(name +" "+surname);
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);
		String s1=(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')?"vovel":"consonent";
		System.out.println(s1);
		
		
	}

}
