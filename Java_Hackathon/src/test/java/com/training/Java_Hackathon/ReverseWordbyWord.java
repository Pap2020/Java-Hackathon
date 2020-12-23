package com.training.Java_Hackathon;

import java.util.Scanner;

public class ReverseWordbyWord {

	
		public static String reverseSentence(String inputString)
		{
			String[] words = inputString.split("\\s");
			String outputString = " ";
			for(int i=words.length-1;i>=0;i--)
			{
				outputString = outputString+words[i]+" ";
			}
			return outputString;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input string:");
			String inputString = sc.nextLine();
			String outputString = reverseSentence(inputString);
			System.out.println("The output string is:"+outputString);
	   	}
		
	}

	


