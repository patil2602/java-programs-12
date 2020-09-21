package InterfaceQuestios;

public class Kids implements VotingApp{
	int age;
	String type;
	
	Kids(int age, String type)
	{
		this.age=age;
		this.type=type;
		
	}
	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		
		if(age<12)
		{
			System.out.println("You have successfully registered under Kids");
		}
		else
		{
			System.out.println("you are not successfully register");
		}
		
		
	}
	@Override
	public void registerVotingNumber() {
		// TODO Auto-generated method stub
		
		if(type=="kids")
		{
			System.out.println("Sorry cannot go for voting because Age must be greater than 12 to vote");
			
		}
		else 
		{
			System.out.println("go for voting");
		}
		
	}

}
