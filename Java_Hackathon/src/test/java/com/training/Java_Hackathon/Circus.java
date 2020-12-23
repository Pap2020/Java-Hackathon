package com.training.Java_Hackathon;

import java.util.Scanner;

public class Circus {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		System.out.println("Enter the length");
		int length = sc.nextInt();
		int height;
		int width;
		Person[] p_array = new Person[length];
		for(int i=0;i<length;i++)
		{
			height = sc.nextInt();
			width = sc.nextInt();
			p_array[i] = new Person (height, width);
		}
		
		for(int i=0;i<p_array.length;i++){
		for(int j=0;j<p_array.length;j++){
			Person temp = p_array[i];
			  p_array[i] = p_array[j];
			  p_array[j] = temp;
		}
		}
		int new_length = p_array.length;
		System.out.println(new_length);
	}

}
