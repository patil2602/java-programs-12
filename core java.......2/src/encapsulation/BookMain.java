package encapsulation;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		String name;
		int price;
		String author = "deshpande";
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Author Book Name is :");
		name=sc.next();
		
		//System.out.println("Enter Name of Author is :");
		//author=sc.next();
		
		System.out.println("Enter Book Price  is ");
		price=sc.nextInt();
		// TODO Auto-generated method stub
		
		Book bo = new Book(name,price,author);
	//	bo.setName("yayati");
		bo.setAuthor("pu.l.deshpande");
	//	bo.setPrice(678);
		
		
		System.out.println("The  Book Name is :"+bo.getName());
		
		System.out.println("The book Author Name is :"+bo.getAuthor());

		System.out.println("The Book Price is :"+bo.getPrice());
	}

}
