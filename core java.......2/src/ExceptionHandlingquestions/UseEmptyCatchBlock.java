//12)	Write a program to check and display if we can write an empty catch block?

package ExceptionHandlingquestions;

import java.util.Scanner;

public class UseEmptyCatchBlock {
	
	void method1()
	{
		int num1,num2,result=0;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a num1");
		num1=sc.nextInt();
		
		System.out.println("enter a num2");
		num2=sc.nextInt();
		
		try 
		{
			result =num1/num2;
		}
		catch()
		{
			System.out.println("infinite");
		}
		System.out.println("result is"+result);
		System.out.println("method 1 is executed");
	}

}
