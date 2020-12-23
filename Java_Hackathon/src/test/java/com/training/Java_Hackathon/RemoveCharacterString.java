package com.training.Java_Hackathon;

import java.util.Scanner;

public class RemoveCharacterString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
	    System.out.println(removeCharAt(str, 3));
	   }
	
	   public static String removeCharAt(String s, int pos) {
	      return s.substring(0, pos) + s.substring(pos + 1);
	   }
	
	}


