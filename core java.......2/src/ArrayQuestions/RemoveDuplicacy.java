package ArrayQuestions;

import java.util.Scanner;

public class RemoveDuplicacy {
	
	
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

		remove(array);

	}
	
	void remove(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;

				}
			}
		}
		duplicate(array);
	}	
		void duplicate(int array[])
		{
		int k=0;
		
		for(int j=0;j<array.length;j++) 
		{
			if(array[j]!=array[j+1])
			{
				
				array[k++]=array[j];
			}
		}
		
		for(int j : array)
		{
			System.out.print("  "+j);
		}
	}
	
	
}
