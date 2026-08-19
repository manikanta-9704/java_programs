package com.arrays;

public class ArayFirstOccurenceElement {

	    static int findFirstOccurrence(int[] arr, int target) {

	        for (int i = 0; i < arr.length; i++) {

	            if (arr[i] == target) {
	                return i;
	            }
	        }

	        return -1;
	    }

	    public static void main(String[] args) {

	        int[] arr = {10, 20, 30, 20, 40, 20};

	        int target = 20;

	        int result = findFirstOccurrence(arr, target);

	        System.out.println("First occurrence index: " + result);
	    }
	}
