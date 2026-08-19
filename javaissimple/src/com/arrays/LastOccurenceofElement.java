package com.arrays;

public class LastOccurenceofElement {

	    static int lastOccurrence(int[] arr, int target) {

	        int lastIndex = -1;

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] == target) {
	                lastIndex = i;
	            }
	        }

	        return lastIndex;
	    }

	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 20, 40, 20};

	        int target = 20;

	        int result = lastOccurrence(arr, target);

	        System.out.println("Last occurrence index = " + result);
	    }
	}
