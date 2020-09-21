/*2.	Follow the instRUCtions:
a)	Create a class EmployeeDemo
b)	Create 4 variables with the modifier as emp_id(protected),emp_name(pUBlic),emp_salary(private),emp
_dept(deaUlt).
c)	Create 4 methods with the signatUREs as
PUBlic  void	doPUBlic(),defaUlt void	doDefaULt(),protected void	doProtected(),private	void doPrivate().
d)	InitialIZe these variables by entering data from the User and display the data of the employee.
e)	Access all the variables from these 4 methods to check the visibility and scope of variables.
f)	Perform the above tasks in same package,same class and in different package in different class.


 * */package modifier;

public class EmployeeDemo {
	protected int emp_id;
	public String emp_name;
	private int emp_salary;
	 String emp_dep;
	
	public void dopublic() 
	{
		System.out.println("i am a public");//anywhere
		
	}
	
//	default void dodefault() 
	{
		System.out.println("i am a default");
		
	}
	
	protected void doprotected() 
	{
		System.out.println("i am a protected");//whithin package and other package through inheritance
		
	}
	
	private void doprivate() //within a class only
	{
		System.out.println("id of private");
		
	}
	void display()
	{
		System.out.println("id of employee is:"+emp_id);
		System.out.println("name of employee is:"+emp_name);
		System.out.println("salary of employee is:"+emp_salary);
		System.out.println("department of employee is:"+emp_dep);
	}
	}
	
