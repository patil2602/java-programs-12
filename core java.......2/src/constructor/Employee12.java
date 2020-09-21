/*1)	Create class Employee with constructors (default and parameterized), 
 * methods (1 with return type (calculating salary), 1 without return type (displaying employeedata)).
 * 
 * */

package constructor;

public class Employee12 {
	String name;
	int id;
	int sal;
	int da,hra;
	//default constructor
	 Employee12() 
	{
		name="ganu";
		id=4567;
		hra=40000;
		da=2000;
		System.out.println("i am default employee");
	}
	 //parameterized constructor
      Employee12(int id,String name,int hra,int da)
	{
	 this.name=name;
	 this.id=id;
	 this.hra=hra;
	 this.da=da;
	System.out.println("i am a parameterized  employee");
	}
 int salary() 
	{
		
		sal= hra+da;
	//System.out.println("employee salary is"+sal);
		return sal;
	}
 void display()
	{
	 	
		System.out.println("employee name is"+name);
		System.out.println("employee id is" +id);
	    System.out.println("employee salary is" +sal);
	}
}
