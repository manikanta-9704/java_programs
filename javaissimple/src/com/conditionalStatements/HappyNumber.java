package com.conditionalStatements;

import java.util.Scanner;

//continuous square of its digits =0/1
/*STACK
┌─────────────────────────┐
│ isHappyNumber(10)       │  ← TOP
│ n = 10                  │
│ sum = 1                 │
└─────────────────────────┘
│ isHappyNumber(13)       │
│ n = 13                  │
│ sum = 10                │
└─────────────────────────┘
│ isHappyNumber(23)       │
│ n = 23                  │
│ sum = 13                │
└─────────────────────────┘
│ main()                  │
└─────────────────────────┘*/
public class HappyNumber {
static int isHappyNumber(int n) {
	int sum=0;
	while(n>0) {
		int r=n%10;//23-->3,2,3,1,0
		sum+=r*r;//9+4=13,9+1=10,0+1=1
		n=n/10;//2,2,1,0,0,0
	}
	//13,10
	if(sum>9) {
		sum=isHappyNumber(sum);//
		
		
	}
	
	return sum;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter range:");
		int num=sc.nextInt();
	for(int i=0;i<num;i++) {
		int sum=isHappyNumber(num);
		if(sum==0||sum==1) {
		System.out.println(i+"   is happy");
		}
	}
		
		sc.close();

	}

}
