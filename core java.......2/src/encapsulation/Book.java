//3)	Create class Book with the following:
//•	Data Members:name,price,Author author(object)
//•	Constructor with args to initialize the variables. iii)Create getter  method to display the details.


package encapsulation;

public class Book {
	private String name;
	private int price;
	private String author;
	
	Book(String name,int price,String author)
	{
		this.name=name;
		this.price=price;
		this.author=author;
	}

	public String getName() {     //only getter
		return name;
	}

	//public void setName(String name) {
	//	this.name = name;
//	}

	public int getPrice() {       //only getter
		return price;
	}

//	public void setPrice(int price) {
//		this.price = price;
//	}

	public String getAuthor() {       //  both getter and setter
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	

}
