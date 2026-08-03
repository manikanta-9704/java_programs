package com.practice.constructor;

public class DemoConstructor {
	DemoConstructor(int id,String name){
		System.out.println(id);
	}
	static void main() {
		DemoConstructor d=new DemoConstructor(101,"mani");
	}

}
