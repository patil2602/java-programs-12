//6)	Write a program to display the concept of throw and throws using checked exceptions.

package ExceptionHandlingquestions;

import java.io.IOException;

public class CheckedThrowAndThrows12 {

	 void check()//throws IOException
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
	 
	 void check1() throws IOException
	 {
		 //check();
		 //System.out.println("checking 1 file is display");
	 }

	 void check2()throws IOException
	 {
		 check1();
		// System.out.println("checking 2 file is display");
	 }
}
