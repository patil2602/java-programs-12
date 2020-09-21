//Write a program to put even and odd elements of array in two separate arrays

package ArrayQuestions;

import java.util.Scanner;

public class EvenOdd2 {
	
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array1");
		int size=sc.nextInt();
		
		int array1[]=new int[size];
		
		System.out.println("enter the elements of array1:");
			for(int i=0;i<array1.length;i++) 
			{
				array1[i]=sc.nextInt();
			}
			int size2 = 0,size3 = 0;
			int array2[]=new int[size2];
			int array3[]=new int[size3];
			
			evenodd(array1,array2,array3);
			
	}
	void evenodd(int array1[],int array2[],int array3[])
	{
		System.out.println("the even elements are:....");
		for(int i=0;i<array1.length;i++)
		{
			if(array2[i]%2==0) 
			{
				array1[i]=i;
				System.out.println(array2[i]+ " ");
			}
				
		}	
			System.out.println("the odd elements are:....");
			for(int i=0;i<array1.length;i++)
			{
				if(array3[i]%2!=0) 
				{
					array1[i]=i;
					System.out.println(array3[i]+ " ");
				}
					
    	}

	}
}
