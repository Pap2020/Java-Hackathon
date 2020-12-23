package com.training.Java_Hackathon;

import java.util.Scanner;

public class LongestPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Longest palindrome is:"+LongestPalindrome.getLongestPalindrome(str));
	}
 public static String getLongestPalindrome(String s)
 {
	 if(s.isEmpty())
	 { return "Enter a proper string";}
	 if(s.length()==1)
	 { return s;}
	 String longest = s.substring(0, 1);
	 for(int i=0;i<s.length();i++)
	 {
	// odd checking
		 String temp = checkForEquality(s,i,i);
		 if(temp.length()>longest.length())
		 { longest = temp;
		 }
	// even checking
		 temp = checkForEquality(s,i,i+1);
		 if(temp.length()>longest.length())
		 { longest = temp;
		 }
		 }
	 return longest;
	 }
   public static String checkForEquality(String s, int begin,int end)
   {
    while(begin>=0 && end<=s.length()-1 && s.charAt(begin)==s.charAt(end))
    {
    	begin --;
    	end ++;
    }
    return s.substring(begin+1, end);
    
 }
}
