package com.training.Java_Hackathon;

import java.util.Scanner;

public class MergesortRecursive {
	
	public void merge(int arr[],int low,int mid,int high)
	{ 
	//Find sizes of two sub arrays to be merged
		int n1 = mid-low+1;
		int n2 = high-mid;
	//create temporary arrays
		int left[] = new int [n1];
		int right[] = new int[n2];
	// copy data to temporary arrays
		for(int i=0;i<n1;i++)
		 left[i] = arr[low+i];
		
		for(int j=0;j<n2;j++)
		right[j]= arr[mid+1+j];
		
		int i=0,j=0,k=low;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{ arr[k]=left[i];
			   i++;
			   
			}
			else
			{ arr[k]=right[j];
			  j++;
			}
			k++;
			}
	//copy remaining elements of left[] array if any
		while(i<n1)
		{ arr[k] = left[i];
		  i++;
		  k++;
		}
	//copy remaining elements of right[] array if any
		while(j<n2)
		{ arr[k]= right[j];
		  j++;
		  k++;
		}
		}
	
		
    public void mergesort(int arr[],int low,int high)
    { 
    	if(low<high)
    	{  int mid = (low+high)/2;
        mergesort(arr,low,mid);
    	mergesort(arr,mid+1,high);
    	merge(arr,low,mid,high);
        }
    }
    //copy all the elements in sorted array to main array
    public static void printElements(int arr[])
    { int n = arr.length;
	for(int i=0;i<n;i++)
    {System.out.print(arr[i]+" ");
    System.out.println( );
    }
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number of elements in the array:");
		int n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" elements ");
		for(int i=0; i < n; i++)
		{
		a[i] = s.nextInt();
		}
		System.out.println( "elements in array ");
		printElements(a);
		MergesortRecursive object1 = new MergesortRecursive();
		object1.mergesort(a,0,a.length-1);
		System.out.println("The sorted array is:");
		printElements(a);
	}
}




	




	
