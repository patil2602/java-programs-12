package inheritanceAssignment;

import java.util.Scanner;

public class WorkerManagerEmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of worker");
		String name = sc.next();
		
		
		System.out.println("enter the address of worker");
		String address = sc.next();
		
		System.out.println("enter the salary of worker");
		int salary = sc.nextInt();
		
		System.out.println("enter the phoneno of worker");
		int phoneno = sc.nextInt();
		
		Employee object=new Employee();
		object.displaysalary(salary);
		object.displaydata() ;
	
		Manager object1=new Manager();
		object1.displaysalary(salary);
		object1.displaydata1() ;
	}

}
