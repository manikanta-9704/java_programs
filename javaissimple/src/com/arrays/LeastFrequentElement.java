package com.arrays;

import java.util.Scanner;

public class LeastFrequentElement {
	void main() {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	int num=sc.nextInt();
	int[]arr= new int[num];
	int leastCount=arr.length;
	 int leastrepeated=arr[0];
	System.out.println("enter array elements:");
	 for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
	 for(int i=0;i<arr.length;i++) {
		 int count=0;
		
		 for(int j=0;j<arr.length;j++) {
			if( arr[i]==arr[j]) {
				count++;
			}
			
		 }
		 if(leastCount>count) {
			 leastCount=count;
			 leastrepeated=arr[i];
		 }
	 }
	 System.out.println("least repeated element: "+leastrepeated);
	 System.out.println("count:"+leastCount);
sc.close();
}
}