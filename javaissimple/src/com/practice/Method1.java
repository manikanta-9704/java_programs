package com.practice;

public class Method1 {
	
	
	int a=12;
	static void show() {
		System.out.println("nothing");
	}
	void display() {
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		Method1 m1 = new Method1();
		Demo d1=new Demo();
		System.out.println(d1.x);
		m1.display();
		m1.show();

	}

}

class Demo{
	int x=20;
}