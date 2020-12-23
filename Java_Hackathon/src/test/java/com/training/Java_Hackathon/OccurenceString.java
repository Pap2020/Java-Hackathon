package com.training.Java_Hackathon;

import java.util.Scanner;

public class OccurenceString {

	public static void main(String[] args) {
		int[] counter = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		 String str = sc.nextLine();
		 int n = str.length();
		 for(int i=0;i<n;i++)
		 {
			 counter[str.charAt(i)]++;
		 }
		 for(int i=0;i<256;i++)
		 {
		  if(counter[i]!=0)
		  {
			  System.out.println((char)i+":"+counter[i]);
		  }
		 }
	}

}

	


