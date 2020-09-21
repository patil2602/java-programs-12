package ExceptionHandlingquestions;

import java.util.Scanner;

import javax.management.relation.InvalidRelationIdException;

public class ThrowUserDefined {
	
	int num1;
	int num2;
	
	void method1() 
	{
	 	Scanner sc = new Scanner(System.in);
	 	
	 	System.out.println("enter num1");
	 	num1=sc.nextInt();
	 	
	 	System.out.println("enter num2");
	 	num2=sc.nextInt();
	 	
	 	try {
	 	if ((num1==num2)==false)
	 		
	 	{
	 		throw new InvalidNumberException("number is invalid");
	 	}
	 	else 
	 	{
	 		System.out.println("num1 and num2 is equal");
	 	}
	 	}
	 	catch(InvalidNumberException n) 
	 	{
	 		  System.out.println("number is verified");
	 	}
	 	
	 	
	 	
	}	 	

}
