//13)	Write a program to generate and handle ArrayIndexOutOfBound Exception using try catch.

package ExceptionHandlingquestions;

import java.util.Scanner;

public class ArrayIndexOutOfBound1 {
	
	void method2()
	{
		
		int array2[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter elements in array: ");
		
		for(int i=0;i<5;i++)                         //for loop is used for 5 elements are entered by user
		{
			array2[i] = sc.nextInt();
		}
		
		System.out.println("Elements entered are: ");  //for lop is used for printing this array elements
		for(int i=0;i<5;i++)
		{
			System.out.println("element is : "+array2[i]);
		}
		
		int result=0;
		
		try
		{
		
			System.out.println(array2[8]);                       //exception 2.......arrayboundexcepion
			System.out.println("this is ArrayIndexOutOfBound Exception");    
		}
		
	
		catch (  ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Handled this exception using try catch");      //when 1st exception arised and excute then .....program close ..jvm not found second exception
		}
		

}
}
