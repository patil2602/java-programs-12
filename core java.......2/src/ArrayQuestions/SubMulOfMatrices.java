//19)	Write a program to calculate the subtraction and multiplication of two matrices entered by the user.

package ArrayQuestions;

import java.util.Scanner;

public class SubMulOfMatrices {
	
	Scanner sc = new Scanner(System.in);

	void input()
	{
		int size;
		System.out.println("Enter size : ");
		size = sc.nextInt();

		int matrix1[][] =new int[size][size];
		int matrix2[][] =new int[size][size];


		System.out.println("Enter elements of matrix 1:");
			for(int row =0;row<size;row++)
				{
					for(int col =0;col<size;col++)
						{
							matrix1[row][col] = sc.nextInt();
						}
				}

		
		System.out.println("Enter elements of matrix 2:");
			for(int row =0;row<size;row++)
				{
					for(int col =0;col<size;col++)
						{
							matrix2[row][col] = sc.nextInt();
						}
				}

		subOfMatrix(matrix1, matrix2, size);
	}

	void subOfMatrix(int matrix1[][],int matrix2[][],int size)
	{
		int matrix3[][] =new int[size][size];
		
		System.out.println("Sub of two matrices is : ");
			for(int row =0;row<size;row++)
				{
					for(int col =0;col<size;col++)
						{
							matrix3[row][col] = matrix1[row][col] - matrix2[row][col];
							System.out.print("   "+matrix3[row][col]);	
						}
					System.out.println();
				}
		
		mulOfMatrix(matrix1, matrix2, size);
	}
	
	void mulOfMatrix(int matrix1[][],int matrix2[][],int size)
	{
		
		int matrix4[][] =new int[size][size];
		
		System.out.println("mul of two matrices is : ");
			for(int row =0;row<size;row++)
				{
					for(int col =0;col<size;col++)
						{
							matrix4[row][col] = matrix1[row][col] * matrix2[row][col];
							System.out.print("   "+matrix4[row][col]);	
						}
					System.out.println();
				}
		
	}

	

}
