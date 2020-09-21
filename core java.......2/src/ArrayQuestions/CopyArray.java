//4)	Write a program to copy an array by iterating the array.

package ArrayQuestions;

import java.util.Scanner;

public class CopyArray {
	
	void input() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size= sc.nextInt();
		
		int array[]= new int[size];
		
		System.out.println("enter the elements of array:");
			for(int i=0;i<array.length;i++) 
			{
				array[i]=sc.nextInt();
			}
			
		int array1[]= new int[size];
		
		copy(array,array1);	
		
	}
	
	void copy(int array[],int array1[]) 
	{
		for(int i=0;i<array.length;i++)
		{
			array1[i]=array[i];
			System.out.println(array1[i]);
		}
		
	display(array1);
	//	System.out.println("new array is"+array1);
	}
	
	void display(int array1[])
	{
		System.out.println("new array is");
		
		for(int i: array1)
		{
			System.out.println("elements are: "+i);
		}

	}
}
