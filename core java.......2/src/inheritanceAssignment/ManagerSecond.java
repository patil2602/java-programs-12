package inheritanceAssignment;

public class ManagerSecond extends EmployeeSecond {
	ManagerSecond(long id,String name,String address,long phone,double sal)
	{
		super(id ,name ,address,phone,sal );
		employeeid=id;
		employeename=name;
		employeeaddress=address;
		employeephone=phone;
		basicsalary=sal;
		
		
	}
	void transportallownces() 
	{
		super.calculateSalary();
		super.transportallownces();

		double transportallownces=basicsalary*15/100;
		System.out.println("manager transport allownces is"+transportallownces);
	}
	void showDetailsOfManagerSecond() 
	{
		System.out.println("name of manager is"+employeename);
		System.out.println("id of manager is"+employeeid);
		System.out.println("address of manager is"+employeeaddress);
		System.out.println("salary of manager is"+basicsalary);
		
	}
}
