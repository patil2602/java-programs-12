/*17)	A shopping portal provides users to register their profile. During registration the system needs to validate the user age above 18 and should be placed in India. If not the system should throw an appropriate error.
a.	Create a user defined exception classes named “InvalidCoUNtryException” & “InvalidAgeException”
b.	Overload the respective constructors.
c.	Create a main class “User Registration” , add the following method,
i.	registerProfile -The parameter are String userName , int age, String country.
ii.	Add the following logic
d.	if country is not equal to “India” throw a InvalidCountryException with error If age <
18	throw a InvalidAgeException with error message“ User is a Minor”.
e.	Invoke the method register Profile from the main method with the data specified and see how the program behaves:
18)	Create a menu driven program Try Catch demo
i)	Try Multi Catch
ii)	Try Finally
iii)	Try Catch Finally
iv)	Throw
v)	Throws

*/

package ExceptionDemo;

import java.util.Scanner;

public class UserReg {

	
	
		
		Scanner sc = new Scanner(System.in);
		int age;
		String country;
		String userName;
		
		

		void registerationProfile()      //throws InvalidCountryNameException, InvalidAgeException
		{
			
	
			System.out.println("Enter userName: ");
			
			userName = sc.next();

			System.out.println("Enter Country: ");
			country = sc.next();//usa

			System.out.println("Enter age: ");
			  age = sc.nextInt();



			  try {

			if((country).equalsIgnoreCase("India") == false)
			{
		    	throw new InvalidCountryNameException("Invalid Country");
			}
			else
			{
				System.out.println("User Belongs to India...Congrats");
			}
			  }
			  catch(InvalidCountryNameException ec) {

				  System.out.println("User is not belongs to india");
				 
				  
			  }




	 try {
		  if(age < 18)
		  {
			  throw new InvalidAgeException("Invalid age");
		  }
		  else
		  {
			  System.out.println("User's age is valid");
		  }
	  }
	  catch(InvalidAgeException e)
	  {
		  System.out.println("User is minor");
		  
	  }
  

	  
		

	}




}
