/*3)	A VotingApp needs to develop an online application for two types of users,
 Adults and children. Both of these users should
 *  be able to register an account. Any user who is less than 12 years of age will be registered as a child and they cannot go for voting,
 *   whereas an adult can but only once.
Note: In future, more users/roles might be added to the App where similar rules will been forced. Develop Interfaces and classes for the categories
 mentioned above.
a. Create an interface VotingApp with the following methods declared
 
The methods in the Kids class should perform the following logic.
i.	registerUser : if age < 12, a message displaying “You have successfully registered under Kids” should be displayed in the console.
If(age>12), a message displaying, “You have not successfully registered” should be displayed in the console.
e. requestVotingNumber: if voting Type is “Kids”, a message displaying “Sorry cannot go for voting because Age must be greater than 12 to vote” should be displayed in the console
The methods in the Adult class should perform the following logic.
i.	registerUser : if age > 12, a message displaying“ You have successfully registered under an Adult” should be displayed in the console.

If age<12, a message displaying, “You have not successfully registered under an Adult” should be displayed in the console.
ii.	requestVotingNumber: if voting Type is “Adult”, a message displaying “Your voting Id will be generated within a day “should be displayed in theconsole.

else, a message displaying, “Oops, you are not” should be displayed in the console.
f.	Create a class “VotingAppDemo.java” with a main method which performs the functions


 * */

package InterfaceQuestios;

public interface VotingApp {

		 void registerUser();
		
		 void registerVotingNumber();
}
