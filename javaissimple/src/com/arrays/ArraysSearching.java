package com.arrays;
import java.util.Scanner;

public class ArraysSearching {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int productId[]= {101,102,103,104,105};
		double price[]= {3000,4000,5000,6000,3000};
		System.out.println("enter search item");
		int searchitem=sc.nextInt();
		boolean found=false;
		for(int i=0;i<productId.length;i++) {
			if(searchitem==productId[i]) {
				System.out.println("product id"+productId[i]);
				System.out.println("product price:"+price[i]);
				found=true;
				
			}
		}
		if(!found) {
			System.out.println("product not found");
		}
		

	}

}
