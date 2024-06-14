package Method_overriding;


// Parent class

public class Vehicle 

{
	    void start() 
	    
	    {
	        System.out.println("Vehicle is starting");
	    }

	    void stop() {
	        System.out.println("Vehicle is stopping");
	    }
}

	
// Child class inheriting from Vehicle
	
class Car extends Vehicle 
{
	    // Overriding the start method from Vehicle
	    @Override
	    void start() 
	    {
	        System.out.println("Car is starting");
	    }

	    // Overriding the stop method from Vehicle
	    @Override
	    void stop() 
	    {
	        System.out.println("Car is stopping");
	    }

	    // Additional method specific to Car
	    void accelerate()
	    {
	        System.out.println("Car is accelerating");
	    }
	
	    
	    /** accelerate Method: This method is specific to Car and demonstrates that 
	     subclasses can have additional methods beyond those in the superclass.**/
}

	
