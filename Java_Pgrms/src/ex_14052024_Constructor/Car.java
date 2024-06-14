package ex_14052024_Constructor;

//In Java, if you don't initialize instance variables explicitly, 
//they will have default values (null for String and 0 for int).


public class Car 
{
	    // Instance variables
	    private String make;
	    private String model;
	    private int year;

	    // Default constructor
	    public Car()
	    {
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	    }

	   
	    
	 public static void main(String[] args) {
	        // Creating a car object using the default constructor
	        Car mc = new Car();
	}
	
}


