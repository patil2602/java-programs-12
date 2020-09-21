//3)	Write a program to remove a specific element from an array

package ArrayQuestions;

import java.util.Scanner;

public class DeletionOfArray {
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size= sc.nextInt();

		int array[] = new int[size];

		System.out.println("Enter elements of array: ");
			
			for(int i=0;i<array.length;i++)                       //accepts elements for array from user
				{
					array[i] = sc.nextInt();
				}
		
		deletion(array);
	}
	
	void deletion(int array[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the position of element to be deleted");
		int deletelement=sc.nextInt();                             //accepts the position from user to for deletion or remove 
		
		int size = 0;
		
		
			if(deletelement>=array.length+1)
				{
					System.out.println("deletion not possible");//prints if the position is greater then not possible
				}
			else
				{
					for(int i = deletelement-1;i<array.length-1;i++)   //shifs elements to the left from given position of deletion element
						{
							array[i]=array[i+1];
						}
			
					System.out.println("after deleting element at location the array is"+deletelement);
				}	
		
		display(array);
	}
			void display(int array[])
				{
					for(int i = 0;i<array.length-1;i++)
						{
							System.out.println("the array elements is"  +array[i]);
						}
				}
	}



