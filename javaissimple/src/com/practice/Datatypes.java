package com.practice;

public class Datatypes {
	//by default RHS numeric value it INT
	byte b;//if we assign value greater than 127 it throws an error"Type mismatch: cannot convert from int to byte"
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean B;
	void defalt() {
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(B);
	}

	public static void main(String[] args) {
		Datatypes d1 = new Datatypes();
		d1.defalt();
		

	}

}
