package constructor;

public class Student {
	
		
		//instance variables
		String name;
		int marks;
		
		//parameterised constructor
		Student(String name,int marks) //local variables
		{
			//values have been copied into local variables 
			//    instance variable = local variable
			         this.name = name;
			         this.marks = marks;
			
		}
		
		
		void display()
		{
			System.out.println(name+"   "+marks);
		}
		
//		void input()
//		{
//			Scanner sc = new Scanner(System.in);
//			System.out.println("ENter name: ");
//			name = sc.next();
//			
//			System.out.println("ENter marks of "+name+" : ");
//			marks = sc.nextInt();
//		}
		
		
		

	}











	/*Types of constructors
		// overloaded constructors
		
		//zero args cons/default constructor
	    Student()
		  {
	    	System.out.println("hii iam default constructor");
			  
		  }
	    
	    //one args constructor
	    Student(int number)
	    {
	    	System.out.println("hii i am one args condtructor");
	    }
	    
	    //two args constructor
	    Student(int number1,int number2)
	    {
	    	System.out.println("hii i am 2 args constructor");
	    }
	    
	    *
	    *  default constructor
	    *  Student()
		{
			name = "Rahul";
			marks = 444;
			
		}
	    *
	    *
	    *********************constructors
	    *
	    *instance variables
		String name;
		int marks;
		
		//parameterised constructor
		Student(String name1,int marks1) //local variables
		{
			//values have been copied into local variables 
			//    instance variable = local variable
			          name = name1;
			          marks = marks1;
			
			
		}
		
		
		void display()
		{
			System.out.println(name+"   "+marks);
		}
		
		******constructor calling from main class
		*
		*
			Student student = new Student("Rahul",444);
			student.display();
			
	    *
	    *
	    *
	    *
	    */
	

