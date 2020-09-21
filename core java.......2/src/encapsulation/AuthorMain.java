package encapsulation;

import java.util.Scanner;

public class AuthorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String authorName;
		String place;
		int age;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Author Name is :");
		authorName=sc.next();
		
		System.out.println("Enter Author Age is :");
		age=sc.nextInt();
		
		System.out.println("Enter Author Place is :");
		place=sc.next();
		
			Author au=new Author(place, authorName, age);
			
			au.setAuthorName(authorName);
	      
	      System.out.println("author name is : "+au.getAuthorName());
	      
	      
	      au.setAge(age);
	      
	      System.out.println("author age is : "+au.getAge());


	      au.setPlace(place);
	      
	      System.out.println("author place is : "+au.getPlace());

	}

}
