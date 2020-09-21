package ExceptionHandlingquestions;

import java.util.Scanner;

public class Finally12 {
	
	
	 void method1() 
	 {
		 int array1[]=new int[5];
		
		 Scanner sc =new Scanner (System.in);
		 System.out.println("enter elements of array");
		 for(int i=0;i<5;i++)
		 {
			 array1[i]=sc.nextInt();
		 }
		 System.out.println("entered elements are:");
		 for(int i=0;i<5;i++)
		 {
			 System.out.println("elements is:"+array1[i]);
		 }
		 
		 try 
		 {
			 
			 int result = array1[2]/array1[3];
			 System.out.println("result is"+result);
			 System.out.println(array1[7]);
		 }
		 catch(ArithmeticException e) 
		 {
			 System.out.println("infinite");
		 }
		 catch(ArrayIndexOutOfBoundsException ae)
		 {
			 System.out.println("array is not found");
		 }
		 finally
		 {
			 System.out.println("program is executed");
		 }
	 }
}
