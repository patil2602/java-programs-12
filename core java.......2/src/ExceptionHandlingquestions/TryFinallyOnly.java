//10)	Write a program to display example where only try and finally block is used.

package ExceptionHandlingquestions;

import java.util.Scanner;

public class TryFinallyOnly {
	
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
			
			System.out.println("result is"+result);
			System.out.println("method 1 is executed");
		}
		finally
		{
			System.out.println("program is execute");
			
		}
		
	}

}
//only try block use kela tar erroe yeto .....try sobat catch ha block use kravach lagel handling sathi