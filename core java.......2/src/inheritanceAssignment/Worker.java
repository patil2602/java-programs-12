/* 1)	Create a class named ‘Worker’ having the following members: Sname, Sage, Sphone number ,Saddress,
 *  Ssalary.It also has a method named 'displaySalary' which displays the salary of the members.
 *   Two classes 'Employee' and 'Manager' inherit the ‘Worker’ class. The 'Employee' and 'Manager' classes 
 *   have data members 'Work specialization' and 'department' respectively. Now, assign name, age,
 *    phone number, address and salary to an employee and a manager by making an object of both of these 
 *    classes and print the same. 
 * */

package inheritanceAssignment;


public class Worker {
	String name,address;
	int phoneno,salary;
	
	void displaysalary( int salary)
	{
		
		System.out.println("the salary of worker is:"+salary);
	}

}
