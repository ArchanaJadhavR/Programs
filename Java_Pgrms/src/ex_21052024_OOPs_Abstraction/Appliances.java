package ex_21052024_OOPs_Abstraction;

/*Question: Create an abstract class Appliance with methods turnOn() and turnOff()
 *  as concrete methods, and an abstract method operate(). Implement two subclasses 
 *  WashingMachine and Refrigerator, where each class provides specific implementation 
 *  for the operate() method.*/

abstract class Appliances
{
	boolean ON ;
	
	// Constructor to initialize ON state
	Appliances (boolean ON)
	{
		this.ON = ON;
		
	}
	
	// Method to turn the appliance ON
	void turnOn() 
	{
		if(ON)
		{
			ON = true;
		 System.out.println("Appliance is ON.");
		}
		else
		{
			System.out.println("Appliance is not Turned ON.");
		}
	}
	
	// Method to turn the appliance OFF
	void turnOff() 
	{
		if(ON)
		{
			ON = true;
		 
	  System.out.println("Appliance is now turning OFF.");
		}
		else
		{
			 System.out.println("Appliance is OFF.");
		}
	}
		
	 // Abstract method that must be implemented by subclasses
	abstract void operate();

}

class WashingMachine extends Appliances
{

	WashingMachine(boolean ON)
	{
		super(ON);
			}
	// Implementation of the operate method
	@Override
	void operate() 
{

       
	if(ON)
	{

		System.out.println("Washing Machine is washing clothes.");
    } 
	
	else 
    {
        System.out.println("Washing Machine is not operating. Please turn it ON.");
    }
	
}	
}
	class Refrigerator extends Appliances
	{

		Refrigerator(boolean ON) {
			super(ON);
			
		}

		@Override
		void operate()
		{

		       
			if(ON)
			{

				System.out.println("Refrigerator is cooling food.");
		    } 
			
			else 
		    {
		        System.out.println("Refrigerator is not operating. Please turn it ON.");
		    }
			
	
		}
		
	}
	
	

