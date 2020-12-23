package com.training.Java_Hackathon;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
	        int temp;
	        int n ;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter how many Numbers to be sorted");
	        n=sc.nextInt();
	        int a[]=new int [n];
	        for(int i=0;i<n;i++)
	        {
	            System.out.println("Enter The Numbers");
	            a[i]=sc.nextInt();
	        }
	        for(int i=0;i<n;i++)
	        {
	            for (int j=i;j<n;j++)
	            {
	                if(a[i]>a[j])
	                {
	                    temp=a[i];
	                    a[i]=a[j];
	                    a[j]=temp;
	                }
	            }
	        }
	        for(int i=0;i<n;i++)
	        {
	            System.out.println("Sorted array is " +a[i]);
	        }
	    }
	}



	


