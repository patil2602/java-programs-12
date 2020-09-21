//16)	Write a program to separate even and odd numbers of an given array of integers. Put all even numbers first, and then odd numbers.



package ArrayQuestions;

import java.util.Scanner;

public class EvenOddArray {
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size= sc.nextInt();

		int array[] = new int[size];

		System.out.println("Enter elements of array: ");
		for(int i=0;i<array.length;i++)
		{
			array[i] = sc.nextInt();
		}

		evenodd(array);

	}
	void evenodd(int array[]) 
	{
	 
		
		//int i = 0;
		for(int i=0;i<array.length;i++) {
		if(array[i]%2==0) 
		{
			System.out.println(array[i]+  " = array element is even");
		}
		else
		{
			System.out.println(array[i]+  " = array element is odd");
		}
	}
		display(array );
		
	}	
	
	void display(int array[])
		{
			for(int i: array)
			{
				System.out.println("elements are: "+i);
			}

			
			
		}

	}



