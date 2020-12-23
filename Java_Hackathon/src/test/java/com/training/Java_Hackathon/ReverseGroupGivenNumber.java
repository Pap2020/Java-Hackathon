package com.training.Java_Hackathon;

import java.util.Scanner;

public class ReverseGroupGivenNumber {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		System.out.println("Enter the elements of the array");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{ arr[i] = sc.nextInt();
	}
    int k=3;
    for(int i=0;i<n;i=i+k)
    {
    	int left=i;
    	int right = Math.min(i+k-1, n-1);
    	int temp;
    while(left<right)
    {
    	temp = arr[left];
    	arr[left]=arr[right];
    	arr[right]=temp;
    	left++;
    	right--;
     }
    }
    for(int i=0;i<n;i++)
    { System.out.println(arr[i]);
    
    }
}
}
