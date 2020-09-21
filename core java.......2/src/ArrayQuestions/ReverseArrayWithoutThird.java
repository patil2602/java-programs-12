//6)	Write a program to find and display reverse of an array without using third variable.

package ArrayQuestions;

import java.util.Scanner;

public class ReverseArrayWithoutThird {
	
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("enter the elements of array:");
			for(int i=0;i<array.length;i++) 
			{
				array[i]=sc.nextInt();
			}
			
	}
	
	void reverseNoThird() 
	{
		
	}

}
