package com.arrays;

public class InsertionShort2 {

	public static void main(String[] args) {
		int[] arr= {10,1,5,4,1};
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i;
			while(j>0&&arr[j-1]>temp) {
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				j=j-1;
				
			}
			
			
		}
for(int number:arr) {
	System.out.println(number+" ");
}
	}

}
