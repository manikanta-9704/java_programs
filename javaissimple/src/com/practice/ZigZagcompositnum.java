package com.practice;

import java.util.*;

public class ZigZagcompositnum {
	static boolean isprime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) {
				return false;
			}

		}

		return true;

	}
 
	public static void main(String[] args) {
		int n = 4;
		int num = 1;
		for (int i = 1; i <= n; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			while (list.size() < i) {
				if (!isprime(num))
					list.add(num);
				num++;

			}
			if (i % 2 == 0) {
				Collections.reverse(list);

			}
			for (int x : list) {
				System.out.print(x + " ");

			}
			System.out.println();
		}
		      
	}
}
