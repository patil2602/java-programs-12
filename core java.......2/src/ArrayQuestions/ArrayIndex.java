package ArrayQuestions;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayIndex{
	
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
	
			System.out.println("enter the element which index to be found");
			element=sc.nextInt();
			
			indexFind(array,element);
		}
	
	
	void indexFind(int array[],int element)
		{
		
			int i = 0;
			for(i=0;i<array.length;i++) {
			if(array[i]==element) 
				{
					System.out.println("the index of given elementis :"+i);
				}
			}
			display(array); 
			
		}
	
	void display(int array[]) 
		{
			//int array;
			for(int i : array)
				{
					System.out.println("elements of array is "+i);
				}
		}

	
	
	
	

}
