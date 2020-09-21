package constructor;





public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank=new Bank();    //call default costructor
		bank.display();
		
		Bank bank1=new Bank(2000);     //call parameterized constructor
		bank1.display();
		
		
		

	}

}
