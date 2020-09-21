package ExceptionDemo;

import java.io.File;
import java.io.IOException;

public class DemoThrows {
	void method1()
	{

		try {
		method2();
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("handled EXCEPTION");
	}
	}
	void method2() throws IOException
	{
		method3();
	}

	void method3() throws IOException 
	{
		File file = new File("test.txt");
		file.createNewFile();
	}

    public static void main(String[] args)
    {
    	DemoThrows ob = new DemoThrows();
    	ob.method1();
    }
}
