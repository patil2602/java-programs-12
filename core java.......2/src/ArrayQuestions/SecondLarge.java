//7)	Write a program to find the second largest element in an array
package ArrayQuestions;

import java.util.Scanner;

public class SecondLarge {
	
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
			second(array);
	}
	
	void second(int array[])
	{
		int temp;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("the second large elment is:  "+array[1]);
	}

	}


