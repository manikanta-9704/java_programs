package com.practice;

public class DemoArray2 {
	void main() {
		int[] numbers= {23,45,56,65,54,34};
		int max=numbers[0];
		int min=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
			}
			else {
				if(numbers[i]<min) {
					min=numbers[i];
					
				}
			}
			
			
		}
		System.out.println(min);
		System.out.println(max);
	}

}
