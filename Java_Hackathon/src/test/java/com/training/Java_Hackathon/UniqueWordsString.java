package com.training.Java_Hackathon;

import java.util.Scanner;

public class UniqueWordsString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String str = sc.nextLine();
		String[] words = str.split(" ");
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			if(words[i].equals("")||words[i].equals(" "))
			{
				continue;
			}
			else
			{
				for(int j=i+1;j<words.length;j++)
				{
				if(words[i].equals(words[j]))
				{
					count=1;
					words[j] = "  ";
					break;
				}
			}
			if(count==0)
				{
					System.out.println(words[i]+"  ");
				}
				count=0;
				}
	}	
		}

}
	


