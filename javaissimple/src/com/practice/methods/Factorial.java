package com.practice.methods;

public class Factorial {
	int factorial(double number) {
		int num=1;
		int i;
		for(i=1;i<=number;i++){
			num=num*i;
		}
		return num;
	}

}
