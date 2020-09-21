package modifier;

import java.util.Scanner;

public class EmployeeDemoMains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the id of employee");
		int emp_id = sc.nextInt();
		
		
		System.out.println("enter the name of employee");
		String emp_name = sc.next();
		
		System.out.println("enter the salary of employee");
		int emp_salary = sc.nextInt();
		
		System.out.println("enter the department of employee");
		String emp_dep = sc.next();
		
		EmployeeDemo object=new EmployeeDemo();
		object.dopublic();
		//object.dodefault();
		//object.doprivate();
		object.doprotected();
		object.display();
		




	}

}
