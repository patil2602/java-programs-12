package inheritanceAssignment;

public class TraineeSecond extends ManagerSecond{
	//double transportallownces;
	TraineeSecond(long id,String name,String address,long phone,double sal)
	{
		super(id, name, address, phone, sal);
		employeename=name;
		employeeid=id;
		employeeaddress=address;
		employeephone=phone;
		basicsalary=sal;
	}
	void transportallownces() 
	{
		double transportallownces=basicsalary*20/100;
		System.out.println("manager transport allownces is"+transportallownces);
	}
	void showDetailsOfTraineeSecond() 
	{
		System.out.println("name of trainee is"+employeename);
		System.out.println("id of trainee is"+employeeid);
		System.out.println("address of trainee is"+employeeaddress);
		System.out.println("salary of trainee is"+basicsalary);
		
	}
}

