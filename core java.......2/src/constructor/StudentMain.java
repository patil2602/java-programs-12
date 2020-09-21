package constructor;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter name: ");
		String name = sc.next();
		
		System.out.println("ENter marks of "+name+" : ");
		int marks = sc.nextInt();
		
		Student stud = new Student(name,marks);
		stud.display();
		

	}

}
