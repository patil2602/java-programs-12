/*1)	Create a class Employee with int id and String name as member variables. 
 * Initialize these variables using getter and setter methods by taking data from the user.
 *  Create object of this class and access these methods from the main method of another class. 
 *  Also provide different values to observe the changes.
 * */

package encapsulation;

public class Employee1 {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
