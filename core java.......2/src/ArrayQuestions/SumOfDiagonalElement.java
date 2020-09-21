package ArrayQuestions;

import java.util.Scanner;

public class SumOfDiagonalElement {
	
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
		
	}

}
