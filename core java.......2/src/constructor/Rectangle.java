/*2)	Create a class named 'Rectangle 'with two data members- length and breadth and a method to calculate the area which is 'length*breadth'.
 *  The class has three constructors which are:
1	- having no parameter - values of both length and breadth are assigned zero.
2	- Having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3	- Having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.

 * 
 * */


package constructor;

public class Rectangle {
	int length;
	int breadth;
	int area;
	
	Rectangle() 
	{
		length=0;
		 breadth=0;
		
	}
	 Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	 Rectangle(int number) 
	{
		length=number;
		breadth=number;
		
	}
	void area() 
	{
		
		area= length*breadth;
		
	}
	void display() 
	{
		area();
		System.out.println("the area is"+area);
	}
	
	}
