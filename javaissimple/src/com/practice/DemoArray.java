package com.practice;

public class DemoArray {

	public static void main(String[] args) {
		int marks[]= {98,88,80,95,97,89};
		int sum=0;
		int avg=0;
		for(int i=0;i<marks.length;i++) {
			sum+=marks[i];
			avg=sum/marks.length;
			
		}
		System.out.println("total marks"+sum);
		System.out.println("average:"+avg);

	}

}
