package com.training.Java_Hackathon;

import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements ");
		for(int i=0; i < n; i++)
		{
		a[i] = s.nextInt();
		}
		System.out.println( "elements in array ");
		printArray(a);
		sort(a,0,n-1);
		System.out.println( "elements after sorting");
		printArray(a);
		}
		 
		
   public static int partition(int arr[],int low,int high)
   {
	   int pivot = arr[high];
	   int i = low-1;//index of smaller element
	   for(int j=low;j<high;j++)
	   {
		   if(arr[j]<=pivot){
		   i++;
		   //swap arr[i] and arr[j]
		   int temp = arr[i];
		      arr[i]= arr[j];
		      arr[j]=temp;
		   }
	   }
	 //swap arr[i+1] and arr[high] (or pivot)
	   int temp = arr[i+1];
	   arr[i+1] = arr[high];
	   arr[high] = temp;
	   return i+1;
   }
	   
 public static void sort(int arr[],int low, int high)
 { 
   if(low<high){
   int pi = partition(arr,low,high);
            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
   }
 }
 
   public static void printArray(int arr[])
   {
	   int n = arr.length;
	   for(int i=0;i<n;i++)
	   System.out.println(arr[i]+" ");
	   System.out.println();
   }
 
 }

