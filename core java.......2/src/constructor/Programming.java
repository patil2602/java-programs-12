//4)	Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
//then the message "I want to learn language" should be printed. If some String is passed it, then in place of " ” the name of that String variable
//should be printed. For example, while Creating object if we pass "Java", then " I want to learn Java" should be printed.




package constructor;

import java.util.Scanner;

public class Programming {
Scanner sc=new Scanner(System.in);
	
	void learn()
	{
		System.out.println("Do you want to learn any language like Java, C, Angular,html,c++: ");
		String ans=sc.next();
		if(ans!=null)
		{
			System.out.println("I want to learn java  "+ans);
		}
		else
		{
			System.out.println("I want to learn language");
		}
		
	}
}
