package com.training.Java_Hackathon;

import java.util.Scanner;

public class SortingInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = sc.nextInt();
		int[] array = new int[length];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<length;i++)
		{
			array[i]= sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<length-1;i++)
		{
			for(int j=0;j<length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
			System.out.println("The sorted integers are");
			for(int index=0;index<array.length;++index)
			{
				System.out.println(array[index]);
			}
		}
}
	
	



	


