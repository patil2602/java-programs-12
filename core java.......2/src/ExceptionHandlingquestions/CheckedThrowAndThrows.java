package ExceptionHandlingquestions;

import java.io.File;
import java.io.IOException;

public class CheckedThrowAndThrows {
	
	 void checking()
		{
			try {
				throw new IOException("file success");
				//File fi =new File("name");
				//fi.createNewFile();
				//System.out.println("file created");
			}
			catch(IOException ee)
			{
				System.out.println("new file display....handled ioexception");
			}
		}
	 
	 void checking1() 
	 {
		 System.out.println("checking 1 file is display");
	 }

	 void checking2() 
	 {
		 System.out.println("checking 2 file is display");
	 }




}
