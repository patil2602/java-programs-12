package constructor;

import java.util.Scanner;

public class BankMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using scanner class.....means user through input
		
		int amount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("do you want to add amount in your account");
		char ans=sc.next().charAt(0);
		
		if(ans =='y')
		{
			System.out.println("enter amount to be added");
			amount=sc.nextInt();
			Bank bank1=new Bank(2000);     //call parameterized constructor
			bank1.display();
			
		}
		else
		{
			Bank bank=new Bank();    //call default costructor
			bank.display();
		}

	}

}
