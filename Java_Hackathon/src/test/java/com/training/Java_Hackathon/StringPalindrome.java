package com.training.Java_Hackathon;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		 String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println("Reversed string is: " +reverse);
		
		if(str.equals(reverse))
		{
			System.out.println("The string is Palindrome");
				}
		else
		{
			System.out.println("The string is not Palindrome");
		}
	}
}


