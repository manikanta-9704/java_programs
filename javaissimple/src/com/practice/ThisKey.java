package com.practice;

public class ThisKey {
	void show() {
		System.out.println(this);
	}

	public static void main(String[] args) {
	
ThisKey k1=new ThisKey();
k1.show();
	}

}
