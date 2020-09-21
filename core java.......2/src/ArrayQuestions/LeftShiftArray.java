package ArrayQuestions;

import java.util.Scanner;

public class LeftShiftArray {
	
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
			
			System.out.println("enter number of rotation");
			int norotation=sc.nextInt();
leftshift(array,norotation);
	}
	
	void leftshift(int array[], int norotation)
	{
		             //store the first element in temp variable
		
		for(int i=1;i<norotation;i++)     //shift one element to the left
		{
			int j,temp;
			 temp=array[0]; 
			array[i-1]=array[i];
			
			for(j=0;j<array.length-1;j++)
			{
				array[j]=array[j+1];
			}
			   
		
		
	array[j]=temp;        //store the temp value in the last position
	
		}
		System.out.println();
		display(array);
	}
	
void display(int array[])
{
	System.out.println("array after left rotation");
	for(int i : array)
	{
		
			System.out.println(i);
		
	
	}

}
}
