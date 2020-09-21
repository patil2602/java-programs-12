package modifier;

public class ModifierPrivate {
	private int number;//instance variable
	private ModifierPrivate()//zero constructor
	{
		number =4000;
	}
	
private	void display() //method
	{
		System.out.println("the value is: "+number);
	}

  
//public static void main(String[] args)
//  {
//checking private accessibility
//	ModifierPrivateDemo ob = new ModifierPrivateDemo();
//	  ob.number = 98;
//	  ob.display();
//  }

}
