package com.training.Java_Hackathon;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		 String str = sc.next();
		String[] arr = str.split(":");
		for(String a:arr)
		 System.out.println(a);
	}

}
