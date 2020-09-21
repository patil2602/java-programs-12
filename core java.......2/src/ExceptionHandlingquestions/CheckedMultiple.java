//5)	Display an example of checked exception and simultaneously use multiple catch block.

package ExceptionHandlingquestions;

import java.io.File;
import java.io.IOException;

public class CheckedMultiple {
//file not found exception demo
	
	 void ioexception()
	{
		try {
			File fi =new File("name");
			fi.createNewFile();
			System.out.println("file created");
		}
		catch(IOException ee)
		{
			System.out.println("new file display....handled ioexception");
		}
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 CheckedMultiple object =new CheckedMultiple();
		object.ioexception();
}
}