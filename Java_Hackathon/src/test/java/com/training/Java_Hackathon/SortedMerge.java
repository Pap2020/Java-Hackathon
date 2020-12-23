package com.training.Java_Hackathon;

import java.util.Scanner;

public class SortedMerge {
 public static void main(String[] args) {
// write your code here
Scanner sc = new Scanner(System.in);
System.out.println("Enter first array length: ");
int first_length = sc.nextInt();
int[] s1 = new int[first_length];
System.out.println("Enter Sorted Array numbers: ");
for(int index=0; index<first_length; index++){
s1[index] = sc.nextInt();
}
System.out.println("Enter second array length: ");
int s_length = sc.nextInt();
int[] s2 = new int[s_length];
System.out.println("Enter Second Sorted Array numbers: ");
for(int index=0; index<s_length; index++){
s2[index] = sc.nextInt();
}

// int[] s1 = {1,3,5,7,9};
// int[] s2 = {2,4,6,8};
int s1_length = s1.length;
int s2_length = s2.length;
int[] s1_s2 = new int[s1_length+s2_length];
int j = 0;
int s_index =0;
int s2_index = 0;
while(s_index<s1_length && s2_index<s2_length){
if(s1[s_index] < s2[s2_index]){
s1_s2[j] = s1[s_index];
s_index++;
}
else{
s1_s2[j] = s2[s2_index];
s2_index++;
}
j++;
}
while(s_index<s1_length){
s1_s2[j] = s1[s_index];
s_index++;
j++;
}
while(s2_index<s2_length){
s1_s2[j] = s2[s2_index];
s2_index++;
j++;
}
for(int index=0; index<s1_s2.length; index++){
System.out.println(s1_s2[index]);
}
   }
}





