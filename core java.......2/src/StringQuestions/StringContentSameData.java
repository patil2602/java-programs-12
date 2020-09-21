//3)	Write a program to check whether two String objects contain the samedata

package StringQuestions;

import java.util.Scanner;

public class StringContentSameData {
	
	void input()
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
				if(ch[i]==ch1[i])
				{
					System.out.println("two strings are equale");
				}
				else
				{
					System.out.println("two strings are not equale");
				}
			}
//	System.out.println("Equals(): "+s1.equals(s2));

	
	}	

}
