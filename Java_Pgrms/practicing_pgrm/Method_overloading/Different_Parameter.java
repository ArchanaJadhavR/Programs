package Method_overloading;

//Method Overloading with Different Parameter Types and data type

public class Different_Parameter 

{
 
	/**This method is static, meaning it belongs to the class itself rather than
	an instance of the class. It takes a single integer parameter and prints it 
	to the console prefixed with "Integer: ".**/
	
   static void show(int a)    // static Method to display an integer
   
    {
        System.out.println("Integer: " + a);
    }


	/**This method is not static, meaning it must be called on an instance 
	  of the Different_Parameter class. It takes a single double parameter
	  and prints it to the console prefixed with "Double: ".**/
   
    void show(double a) // Method to display a double
 // defines an instance method that takes a double parameter and does not return a value.

    {
        System.out.println("Double: " + a);
    }

    // Method to display a string
    void show(String a)
    {
        System.out.println("String: " + a);
    }

public static void main(String[] args)//The main method is the entry point of the program.

{
//Here, an instance of Different_Parameter is created and stored in the variable obj.
    	Different_Parameter obj = new Different_Parameter ();
    	
//This line calls the static method show with an integer argument 100.      
    	
    	show(100);//static method
    	
 //This line calls the instance method show on the object obj with a double argument 100.5.
    	obj.show(100.5);
        obj.show("Hello");
    }


	
	}

/** Summary
The class Different_Parameter demonstrates method overloading by defining multiple show methods with different parameter types (int, double, and String).
The static show method is called without creating an instance of the class, while the instance show methods are called on an instance of the class.
Method overloading allows the same method name to be used with different types of parameters, providing flexibility and readability in the code.

-->the static method show(int a) in your Different_Parameter class is called directly because static methods belong to the 
class itself and can be accessed without creating an instance of the class.

-->In Java, the keyword "void" is used in the method declaration to specify that the method does not return any value.

-->In your Different_Parameter class, the methods are declared with void because their purpose is to perform an action
 (printing to the console) rather than to compute and return a value.
**/

