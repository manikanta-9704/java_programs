package com.labtasks;
import java.util.*;
public class Subsum {

	public static void main(String[] args) {
		        int arr[] = {1,5,6,7,3};

		        int target = 9;

		        HashSet<Integer> set = new HashSet<>();

		        for(int x : arr){

		            int diff = target - x;

		            if(set.contains(diff))
		                System.out.println("(" + x + "," + diff + ")");

		            set.add(x);
		         
		            }
		        for(int result:set) {
	            	System.out.print(result);
		        }
		    }
		}


