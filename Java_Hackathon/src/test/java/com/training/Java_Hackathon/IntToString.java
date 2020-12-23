package com.training.Java_Hackathon;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		 int i = sc.nextInt();
	 // String s = String.valueOf(i);
		 String s = Integer.toString(i);
		 System.out.println(s);
	}

}
