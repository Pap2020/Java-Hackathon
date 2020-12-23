package com.training.Java_Hackathon;

import java.util.Scanner;

public class MergeTwoArrays {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array1:");
		int n1 = s.nextInt();
		int[] arr1 = new int[n1];
		System.out.println("Enter number of elements in the array2:");
		int n2 = s.nextInt();
		int[] arr2 = new int[n2];
		System.out.println("Enter "+n1+" elements ");
		for(int i=0; i < n1; i++)
		{
		arr1[i] = s.nextInt();
		}
		System.out.println("Enter "+n2+" elements ");
		for(int i=0; i < n2; i++)
		{
		arr2[i] = s.nextInt();
		}
	      int[] merge = new int[n1 + n2];
	      int i = 0, j = 0, k = 0, x;
	      System.out.print("Array 1: ");
	      for (x = 0; x < n1; x++)
	      System.out.print(arr1[x] + " ");
	      System.out.print("\nArray 2: ");
	      for (x = 0; x < n2; x++)
	      System.out.print(arr2[x] + " ");
	      while (i < n1 && j < n2) {
	         if (arr1[i] < arr2[j])
	            merge[k++] = arr1[i++];
	         else
	            merge[k++] = arr2[j++];
	      }
	      while (i < n1)
	      merge[k++] = arr1[i++];
	      while (j < n2)
	      merge[k++] = arr2[j++];
	      System.out.print("\nArray after merging: ");
	      for (x = 0; x < n1 + n2; x++)
	      System.out.print(merge[x] + " ");
	   }
	}

		
	