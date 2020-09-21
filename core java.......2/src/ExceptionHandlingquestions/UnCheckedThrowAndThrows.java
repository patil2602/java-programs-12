//7)	Write a program to display the concept of throw and throws using unchecked exception.

package ExceptionHandlingquestions;

import java.util.Scanner;

public class UnCheckedThrowAndThrows {
	
	void method1()throws ArithmeticException
	{
		int num1,num2,result = 0 ;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a num1");
		num1=sc.nextInt();
		
		System.out.println("enter a num2");
		num2=sc.nextInt();
		try 
		{
			result =num1/num2;
			throw new ArithmeticException();
		}
		
		catch(ArithmeticException ee)
		{
			System.out.println("result is"+result);
			System.out.println("infinite");
		}
		
	}
	
	void method2()throws ArithmeticException
	{
		method1();
		System.out.println("method 2 is executed");
	}
	void method3()throws ArithmeticException
	{
		method2();
		System.out.println("method 2 is executed");
	}


}
