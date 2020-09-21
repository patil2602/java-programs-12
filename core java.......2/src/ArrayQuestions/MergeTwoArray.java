//25)	Write a program to merge two arrays into third array.

package ArrayQuestions;

import java.util.Scanner;

public class MergeTwoArray {
	
	void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array1: ");
		int size= sc.nextInt();

		int array1[] = new int[size];

		System.out.println("Enter elements of array1: ");
		for(int i=0;i<array1.length;i++)
		{
			array1[i] = sc.nextInt();
		}
		
		
		System.out.println("Enter size1 of array2: ");
		int size2= sc.nextInt();

		int array2[] = new int[size2];

		System.out.println("Enter elements of array2: ");
		for(int i=0;i<array2.length;i++)
		{
			array2[i] = sc.nextInt();
		}
		
		int a_length = array1.length;
		int b_length = array2.length;
		int c_length = a_length + b_length;
		
		
		int array3[] = new int[c_length];
	
		
		merge(array3,array1,array2);

	}
	void merge(int array3[],int array1[],int array2[])
	{
		for(int i=0;i<array1.length;i++)
		{
			array3[i]=array1[i];
		}
		
		for(int i=0;i<array2.length;i++)
		{
			array3[array1.length+i]=array2[i];
		}
		System.out.print("the lements of array3 are .....");
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+"  ");
		}
	}

}
