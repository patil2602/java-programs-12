/*6)	Create two methods and calculate area and circumference of a Circle In the Circle.javaclass, 
 * create two methods as listed below
a.	Method 1 – calculate CircleArea should accept the float radius as parameter and calculate the area 
(pi*r*r). It should return the result value to the main method where it should be printed in the console.
b.	Method 2 – calculate Circumference should accept float radius as parameter and calculate the 
circumference (2 * pi * r). It should return the result value to the main method where it should be printed
 in the console.
Call these two methods from the main method in Circle.java by passing appropriate parameters.



 * 
 * */
package constructor;

public class Circle {
	float area;
	float circumference;
	float pi=3.14f;
	float circleArea(float radius) 
	{
		
		area=pi*radius*radius;
		System.out.println("the area of circle is"+area);
		return area;
	}
	float circleCircumference() 
	{
		float radius=2.5f;
		float pi=3.14f;
		circumference=2*pi*radius;
		System.out.println("the area of circumference is"+circumference);
		return circumference;
	}

}
