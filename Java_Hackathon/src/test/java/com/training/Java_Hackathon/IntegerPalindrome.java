package com.training.Java_Hackathon;

import java.util.Scanner;

public class IntegerPalindrome {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int flag = 0;
		for(int i=0;i<n/2 && n!=0;i++)
		{
			if(a[i]!=a[n-1-i])
			{
				flag=1;
				break;
			}
		}
			if(flag==1)
			{
			System.out.println("The given array is not a palindrome");
			}
			else
			{
				System.out.println("The given array is a palindrome");
			}
		}
}


