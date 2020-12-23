package com.training.Java_Hackathon;

import java.util.Scanner;

public class BooleanCheck {
	public static void main(String[] args) {
				Boolean a,b,c;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter true or false for a:");
				   a = sc.nextBoolean();
			    System.out.println("enter true or false for b:");
				   b= sc.nextBoolean();
			    System.out.println("enter true or false for c:");
				   c = sc.nextBoolean();
				   if(a&&b||b&&c||a&&c)
				   {
					   System.out.println("Atleast two out of three are true");
				   }
				 else
				   { 
						System.out.println("Atleast two out of three are false");
				   }
				   
						
			}
	}
	

	


