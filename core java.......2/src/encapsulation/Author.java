/*2)	Create a class Author with the following:
•	Data Members: authorName,age,place.
•	Constructor with arguments to initialize the variables. iii)Use getter and setter methods to get 
 & set the values.

 * */

package encapsulation;

public class Author {
	
	private String authorName;
	private String place;
	private int age;
	
	Author(String authorName,String place,int age)
	{
		this.authorName=authorName;
		this.place=place;
		this.age=age;
		
	}
		public String getAuthorName() {
		return authorName;
	}
				public void setAuthorName(String authorName) {
				this.authorName = authorName;
	}
		public String getPlace() {
		return place;
	}
				public void setPlace(String place) {
				this.place = place;
	}
		public int getAge() {
		return age;
	}
				public void setAge(int age) {
				this.age = age;
	}
	
	
	
	

}
