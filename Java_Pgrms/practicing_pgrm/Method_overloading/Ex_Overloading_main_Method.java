package Method_overloading;

public class Ex_Overloading_main_Method 
{
 
	    // Standard main method, entry point of the application
	    public static void main(String[] args) 
	    {
	        System.out.println("Standard main method");
	        
	        // Calling the overloaded main methods
	        main(5); // Calls the main method with int parameter
	        main("Hello"); // Calls the main method with String parameter
	    }
	    
	    // Overloaded main method with int parameter
	    public static void main(int a) 
	    {
	    	
	        System.out.println("Overloaded main method with int parameter: " + a);
	    }
	    
	    // Overloaded main method with String parameter
	    public static void main(String str)
	    {
	        System.out.println("Overloaded main method with String parameter: " + str);
	    }
	

}

/* Key Points
Overloading the main method does not affect the entry point of the program.
The Java runtime environment always calls the main(String[] args) method to start the application.
Overloaded main methods can be called explicitly from the standard main method or other methods.
Overloaded main methods follow the same rules as other overloaded methods,
 meaning they must have different parameter lists.*/
