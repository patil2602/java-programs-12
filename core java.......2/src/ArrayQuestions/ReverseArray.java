//5)	Write a program to find and display reverse of an array using third variable

package ArrayQuestions;

import java.util.Scanner;

public class ReverseArray {
	
	void input()
	{
	
		Scanner sc = new Scanner (System.in);
		int size;
		System.out.println("enter the size of array");
		size=sc.nextInt();
	
		int array[]=new int[size];
		
		System.out.println("elements of array are:");
		for (int i=0;i<array.length;i++) 
			{
				array[i]=sc.nextInt();
			}
		reverse(array);
	}
	
	void reverse(int array[]) 
	{
		for(int i=0;i<array.length/2;i++) 
		{
			int temp = array[i];                         //swapping of two numbers
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = temp;
			
			
		}
		//System.out.println("reverse array is");
		display(array);
		
	}
	void display(int array[])
	{
		System.out.println("reverse array is");
		for(int i: array)
		{
			
			System.out.println("elements are: "+i);
			
		}

	}
	
	
}
