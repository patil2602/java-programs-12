//14)	Write a program to get the difference between the largest and smallest values in an array of integers.

package ArrayQuestions;

import java.util.Scanner;

public class DifferenceSmallestLargest {
	
	void input()
	{

		Scanner sc = new Scanner(System.in);
		int element;

		System.out.println("Enter size of array: ");
		int size=sc.nextInt();
		
		int array[] = new int[size];

		System.out.println("enter the elements of array:");
			for(int i=0;i<array.length;i++)
				{
					array[i] = sc.nextInt();
				}
			largeNumber(array);
	}
	
	void largeNumber(int array[])
	{
		int max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		
		System.out.println("largest element is:  "+max);
		smallNumber(array,max);
	}
	
	void smallNumber(int array[], int max)
	{
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		
		System.out.println("smallest element is:  "+min);
	
		 difference(max,min); 
	}
	void difference(int max,int min) 
	{
		
		int differ;
		differ= max-min;
		System.out.println("the difference between largest and smallest element is:   "+differ);
	}

}
