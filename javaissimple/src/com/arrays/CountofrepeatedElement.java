package com.arrays;

public class CountofrepeatedElement {
	 static int Occurrence(int[] arr, int target) {

	        int count=0;

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] == target) {
	                count++;
	            }
	        }

	        return count;
	    }

	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 20, 40, 20};

	        int target = 20;

	        int result = Occurrence(arr, target);

	        System.out.println("Last occurrence index = " + result);
	    }
}
