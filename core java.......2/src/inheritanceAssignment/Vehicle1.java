 /*2)	Define a class named Vehicle as described below:
i)	Data Members:
a.	vehicle name
b.	vehicle model number
c.	vehicle price
d.	service station name
ii)	Methods:
a.	Constructor
b.	Display() method to display all the details of class Vehicle .
iii)	Define another class named Bike that extends the class Vehicle.
a.	Data Members: discountRate
b.	Constructor
c.	Methods:display() to display bike name,bike model number,bike price,service station name,discount rate.
iv)	Discount() method to compute the discount.
v)	Create an object for the class Bike and test it.
1.
*/

package inheritanceAssignment;

public class Vehicle1 {
	String vname;
	int vid;
	int vprice;
	
	Vehicle1()
	{
		vname="car";
		vid=1234;
		vprice=4000;
			
		
	}
	void display1()
	{
		System.out.println("name of vehicle"+vname);
		System.out.println("id of vehicle"+vid);
		System.out.println("price of vehicle"+vprice);
	}
}
