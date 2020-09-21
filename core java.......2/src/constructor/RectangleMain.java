package constructor;

public class RectangleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect=new Rectangle();  //call default constructor
		rect.area();
		rect.display();
		
		Rectangle rect1=new Rectangle(30,40);  //call two parameterized constructor
		rect1.area();
		rect1.display();
		
		Rectangle rect2=new Rectangle(40);  //call one parameterized constructor
		rect2.area();
		rect2.display();
		
	}

}
