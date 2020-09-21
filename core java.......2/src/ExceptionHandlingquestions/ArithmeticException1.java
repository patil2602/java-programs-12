package ExceptionHandlingquestions;

import java.util.Scanner;

public class ArithmeticException1 {
	
	void method1()
	{
		int num1,num2,result;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter a num1");
		num1=sc.nextInt();
		
		System.out.println("enter a num2");
		num2=sc.nextInt();
		
		result =num1/num2;
		System.out.println("result is"+result);
		System.out.println("method 1 is executed");
	}
	
	void method2()
	{
		method1();
		System.out.println("method 2 is executed");
	}
	void method3()
	{
		method2();
		System.out.println("method 2 is executed");
	}

}


