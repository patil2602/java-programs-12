/** Define a class named Square as shown below:
i)	Data Member: side
ii)	Method are a(iii) costructor
 * iv)	Define another class Rectangle that extends class Square
a.	Data Member: length,breadth
b.	Constructor.
c.	Methods: area()
v)	Define one more class named Triangle that extends the class Rectangle
a.	Data Member: side1,side2,side3
b.	Constructor
c.	Methods: area()
vi)	Create objects for the classes Square,rectangle and Triangle.Test them.

 */

package inheritanceAssignment;

public class Rectangle extends Square {
	int length=20;
	int breadth=30;
	int area1;
	
	void area1() 
	{
		area1=length*breadth;
		System.out.println("the area of rectangle is"+area1);
	}

}
