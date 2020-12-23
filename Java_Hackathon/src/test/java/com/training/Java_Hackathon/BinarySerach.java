package com.training.Java_Hackathon;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySerach {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{ 
			arr[i] =sc.nextInt();
			}
		System.out.println("Enter the key to search");
		int key = sc.nextInt();
		 System.out.println(key + " found at index = "
                 +Arrays.binarySearch(arr,key)); 
	}	
}