//6)	Write a program to show the implementation of final keyword.

package inheritanceAssignment;

public class FinalKeyword {
	final int num1 = 5;
	void sum()

	{
		final int num1=6;
		System.out.println(num1);
		
		 int result=num1+num1;
		System.out.println("The Addition is :"+result);

	}
	
	final void addition()
	{
		System.out.println("number is : "+num1);
		
		int result=num1+num1;
		System.out.println("The Addition is :"+result);

		
	}
	

public static void main(String[] args) {
	
	FinalKeyword fin=new FinalKeyword();
	fin.sum();
	fin.addition();

}

}
