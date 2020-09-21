package StringQuestions;

import java.util.Scanner;

public class CompareTwoStrings {
	
	void compare()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string 1: ");
		String s1  = sc.next();

		System.out.println("Enter a string 2: ");
		String s2  = sc.next();
	
		char ch[] = s1.toCharArray();
		char ch1[] = s2.toCharArray();
		for(int i=0;i<ch.length;i++)

			{
				if(ch[i]>ch1[i])
				{
					//System.out.println("s1 is greater than s2");
				}
				//System.out.println("s1 is greater than s2");
			
	
				else if(ch[i]<ch1[i])
				{
					System.out.println("s1 is less than s2");
				}
				else
				{
					System.out.println("two strings are equale");
				}
			}
	

	}
	}
