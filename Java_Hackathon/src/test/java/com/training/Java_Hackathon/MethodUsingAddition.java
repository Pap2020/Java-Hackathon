package com.training.Java_Hackathon;

import java.util.Scanner;

public class MethodUsingAddition {
		public static void main(String[] args) {
		// write your code here
		// int a = 6;
		// int b = 3;
		// String oper = "-";
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		String oper = sc2.nextLine();
		int result = operator(a, b, oper);
		System.out.println(result);
		}
		public static int operator(int a, int b, String oper){
		int result = 0;
		if(oper.equals("*")){
		result = 0;
		for(int i =1; i <= b; i++){
		result = result + a;
		}
		}
		else if(oper.equals("-")){
		result = a + (-1 * b);
		}
		else if(oper.equals("/")){
		result = 0;
		while(b <= a){
		result += 1;
		b = b + b;
		}
		}
		return result;
		}
		}

    

