//Write a program to find maximum element in a matrix.

package ArrayQuestions;

import java.util.Scanner;

public class MaximumElementInMatrix {
	
	Scanner sc = new Scanner(System.in);

	
	void input()
	{
		
			int size;
			System.out.println("Enter size: ");
			size = sc.nextInt();

			int array[][] = new int[size][size];

			System.out.println("Enter elements: ");

			for(int row =0;row<size;row++)
			{
				for(int col =0;col<size;col++)
				{
					array[row][col] = sc.nextInt();
				}
			}
	maxElement(array,size);
	
	}
	
	void maxElement(int array[][],int size)
	{
		for(int col =0;col<size;col++)
		{
			int max = array[array.length-1][col];

			for(int row = 0;row<size;row++)
			{
				if(array[row][col]>max)
				{
					max= array[row][col];
				}

			}
			System.out.print(max+"  ");
		}
		display(array,size);
	}
	void display(int array[][],int size)
	{
		System.out.println("The matrix is : ");
		for(int row =0;row<size;row++)
		{
			for(int col =0;col<size;col++)
			{
				System.out.print(" "+array[row][col]);
			}
			System.out.println();
		}
	}	
}
