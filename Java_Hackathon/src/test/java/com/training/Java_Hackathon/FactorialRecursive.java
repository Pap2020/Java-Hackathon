package com.training.Java_Hackathon;

import java.util.Scanner;

public class FactorialRecursive {
		public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the number");
				double num1 = sc.nextDouble();
				double factorial =  FactorialNumber(num1);
			System.out.println("Factorial of entered number is:" +factorial);
		}
		
		public static double FactorialNumber(double num)
	    { 
		   	double output=1;
		    if(num==1)
		    { return  1;
		    }
		    else
		    {
		    	output= num*FactorialNumber(num-1);
		    	return output;
		    }
		    }
	}


