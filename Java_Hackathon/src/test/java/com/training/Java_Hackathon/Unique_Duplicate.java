package com.training.Java_Hackathon;
import java.util.Arrays;
import java.util.Scanner;

public class Unique_Duplicate {

	public static void main(String[] args) {
		// write your code here
		System.out.println("Enter the length of a given array");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int [] numbers = new int[length];
		System.out.println("Enter the length of a given array");
		for(int index=0; index<length; index++){
		numbers[index] = sc.nextInt();
		}
		int[] unique_numbers = new int[numbers.length];
		int u_index = 0;
		int count;
		for(int index=0; index<numbers.length; index++){
		int unique_number = numbers[index];
		int numberIndex = indexOf(unique_numbers, unique_number);
		if(numberIndex == -1){
		unique_numbers[u_index] = unique_number;
		u_index++;
		count = 0;
		for(int j = 0; j<numbers.length; j++){
		if(unique_number == numbers[j]){
		count++;
		}
		}
		if(count>1){
		System.out.println("Number " + unique_number+" is repeated " + count + " times");
		}
		}
		}
		System.out.println("Unique Numbers are: ");
		for(int jindex=0; jindex < u_index; jindex++){
		System.out.println(unique_numbers[jindex]);
		}

		}
		public static int indexOf(int[] numbers, int number){
		int ind=-1;
		for(int index=0; index < numbers.length; index++){
		if(numbers[index] == number){
		ind = index;
		break;
		}
		}
		return ind;
		}
		}

