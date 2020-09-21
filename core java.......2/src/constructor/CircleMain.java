package constructor;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float radius;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter the value of radius :");
		radius=sc.nextFloat();
		
		Circle object=new Circle();
		object.circleArea(radius);//user through input using scanner
		
		object.circleCircumference();//system through radius value

	}

}
