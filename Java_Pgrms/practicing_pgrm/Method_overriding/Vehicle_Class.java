package Method_overriding;

public class Vehicle_Class
{
	// Main class to demonstrate method overriding
	 
    
    public static void main(String[] args)
    
    {
        Vehicle vehicle = new Vehicle(); // Vehicle reference and object
        Vehicle car = new Car();         // Vehicle reference but Car object

        vehicle.start();   // Outputs: Vehicle is starting
        vehicle.stop();    // Outputs: Vehicle is stopping

        car.start();       // Outputs: Car is starting (Dynamic Polymorphism)
        car.stop();        // Outputs: Car is stopping (Dynamic Polymorphism)

        // Compilation error: Car-specific method 'accelerate' cannot be called via Vehicle reference
        // vehicle.accelerate();
        
        // Explicit casting to access Car-specific method
        ((Car) car).accelerate(); // Outputs: Car is accelerating
    
        
    
    }
    
}




