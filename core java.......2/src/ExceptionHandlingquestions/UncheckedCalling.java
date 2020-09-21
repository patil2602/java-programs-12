//3)	Write a program to display an example to check if an unchecked Exception is propagated in calling stack

package ExceptionHandlingquestions;

import java.util.Scanner;

public class UncheckedCalling {
	int num1;
	int num2;
	int result;
	
	void method1() 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a num1");
		int num1=sc.nextInt();
		
		System.out.println("enter a num");
		int num2=sc.nextInt();
		try {
		result=num1/num2;
		System.out.println("result is"+result);
		}
		catch(ArithmeticException object1) 
		{
			System.out.println("infinite");
		}
	}
	void method2()
	{
		method1();
		System.out.println(" print method 2 ");
	}
	
	void method3()
	{
		method2();
		System.out.println(" print method 3 ");
	}

}


