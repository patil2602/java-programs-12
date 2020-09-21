package inheritanceAssignment;

public class Employee extends Worker {
	String name="jyotsna";
	int age=25;
	int phonenumber=56432;
	String address="shanipeth chaughule plot";
	
	 void displaydata() 
	 {
		System.out.println("the name of employee:"+name); 
		System.out.println("the age of employee:"+age); 
		System.out.println("the address of employee:"+address); 
		System.out.println("the phonenumber of employee:"+phonenumber); 
	 }

}
