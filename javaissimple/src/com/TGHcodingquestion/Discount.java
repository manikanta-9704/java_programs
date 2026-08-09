package com.TGHcodingquestion;

import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] newArr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
              newArr[i] = arr[i]; 

              for (int j = i + 1; j < n; j++) {

                if (arr[j] <= arr[i]) {
                    newArr[i] = arr[i] - arr[j];
                   break;
                }
            }
        }

        System.out.println("Final Prices:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
        sc.close();
    }
}
