package com.training.Java_Hackathon;

import java.util.Scanner;

public class DuplicateCharString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char[] arr = str.toCharArray();
			for(int i=0;i<str.length();i++)
	        {
	        for(int j=i+1;j<str.length();j++)
	        { 
	        	if(arr[i] == arr[j])
	        	{    
	        		System.out.println("Duplicate characters are:"+arr[j]);
	             	break;
	        		
	      	}
	        }
	         
	}
	}
}
