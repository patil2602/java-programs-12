package constructor;

import java.util.Scanner;

public class EmployeeMain12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee12 e=new Employee12();
		e.salary();
		e.display();

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the id");
		int id=sc.nextInt();
		
		System.out.println("enter the hra");
		int hra=sc.nextInt();
		
		System.out.println("enter the da");
		int da=sc.nextInt();
		
		Employee12 e1=new Employee12(id,name,hra,da);
		e1.salary();
		e1.display();
	}

}
