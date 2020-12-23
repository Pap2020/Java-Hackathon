package com.training.Java_Hackathon;

  public class Person {
	int height;
	int weight;
	
 public Person(int height,int weight)
 {  
	 this.height = height;
	 this.weight = weight;
 }
  
 public Boolean isBiggerThan(Person p1)
 {
	 if((p1.height>this.height)&&(p1.weight>this.weight))
	 {
		 return false;
	 }
	 return true;
 }

}
