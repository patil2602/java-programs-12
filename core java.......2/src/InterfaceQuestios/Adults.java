package InterfaceQuestios;

public class Adults implements VotingApp {
	int age1;
	String type1;

	Adults(int age1,String type1)
{
		this.age1=age1;
		this.type1=type1;
}
	@Override
	public void registerUser() {
		// TODO Auto-generated method stub
		if(age1>12)
		{
			System.out.println("You have successfully registered under adults");
		}
		else
		{
			System.out.println("you are not successfully register");
		}
		
		
	}

	@Override
	public void registerVotingNumber() {
		// TODO Auto-generated method stub
		if(type1=="adults")
		{
			System.out.println("Your voting Id will be generated within a day");
			
		}
		else
		{
			System.out.println("oops you are not");
		}
	}

}
