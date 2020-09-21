package inheritanceAssignment;

import java.util.Scanner;

public class EmployeeSecondMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long id;
		String name,address;
		long phone;
		double salary = 0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id");
		id=sc.nextInt();
		
		System.out.println("enter the name");
		name=sc.next();
		
		System.out.println("enter the address");
		address=sc.next();
		
		System.out.println("enter the phone");
		phone=sc.nextLong();
		
		//System.out.println("enter the basicsalary");
		//double basicsalary = sc.nextDouble();
		
		//double basicsalary;
		new EmployeeSecond(id, name, address, phone, salary );
		
		
		ManagerSecond object=new ManagerSecond(id,name,address,phone,salary);
		object.showDetailsOfEmployee();
		object.showDetailsOfManagerSecond();
		object.showDetailsOfManagerSecond();
		object.calculateSalary();//(salary);
		object.transportallownces();
			
			TraineeSecond object1=new TraineeSecond(id,name,address,phone,salary);
			object1.showDetailsOfEmployee();
			object1.showDetailsOfManagerSecond();
			object1.showDetailsOfTraineeSecond();
			object1.calculateSalary();//(salary);
			object1.transportallownces();
	}
	

}
