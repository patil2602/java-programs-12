/*3)	Create a class Bank .Initialize an instance variable ” amount” with an initial amount of Rs.7000 and 
 * assume you have to add some more amount to it. Now make two constructors of this class as follows:
1	- without any parameter - no amount will be added to the Bank
2	- having a parameter which is the amount that will be added to Bank Create object of the 'AddAmount' class and 
display the final amount in Bank

 * */

package constructor;

public class Bank {
	int amount=7000;//instance variable
	//zero constructor
	
	Bank()      //no amount will be added
	{
		System.out.println("no amount has been added to your account..:"+amount);
	}
	 
	 //one parameter constructor
	
	 Bank(int amount) 
	{
		 System.out.println("The amount of "+amount+" has been credited to your account");
		this.amount=this.amount+amount;//the instance variable value of amount is copied into this.amount local variable//amount=7000+4000
		
		
		
	}
	 void display() 
	{
		System.out.println("the amount balance is:" +amount);
	}
	
	

}
