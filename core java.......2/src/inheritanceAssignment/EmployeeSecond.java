/*7)	Problem Statement on above scenario
tance variables.
Create a class Emplo Instance
variables	yee with the following ins Data type
employeeId	Long
employeeName	String
employee
Address	String
employee Phone	Long
basicSalary	Double
specialAllowance	double	default value- 250.80
Hra	double,	default value- 1000.50
a.	Create an overloaded constructor in the employee class, which takes the below constructor parameters
 and initializes them to 
their respective instance variables.
Constructor parameter	Instance Variable

 * 
 * */

package inheritanceAssignment;

import java.util.Scanner;

//import java.util.Scanner;

public class EmployeeSecond {
	long employeeid;
	String employeename;
	String employeeaddress;
	double employeephone;
	double basicsalary;
	double specialallownces;
	double hra;
	double salary;
	double transportallownces;
	
	EmployeeSecond(long id,String name,String address,double phone,double sal)
	{
		employeeid=id;
		employeename=name;
		employeeaddress=address;
		employeephone=phone;
		basicsalary=sal;
		specialallownces=250.80f;
		hra=1000.50;
		//this.salary=salary;
		
		
	}
	void calculateSalary() //(double salary) 
	{

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the basic salary : ");
		basicsalary=s.nextDouble();
		salary=basicsalary + (basicsalary *specialallownces/100) + (basicsalary*hra/100);
		System.out.println("the salary of employee is"+salary);
	}
	void transportallownces()//(double transportallownces)
	{
		 transportallownces=10/100*basicsalary;
		System.out.println("transportallownces of employee is"+transportallownces);
	}
	void showDetailsOfEmployee()
	{
		//calculateSalary();//(salary);
		
		System.out.println("the employee transport is"+transportallownces);
		System.out.println("the name of employee is"+employeename);
		System.out.println("the id of employee is"+employeeid);
		System.out.println("the address of employee is"+employeeaddress);
		System.out.println("the salary of employee is"+salary);
		
	}
	
}
