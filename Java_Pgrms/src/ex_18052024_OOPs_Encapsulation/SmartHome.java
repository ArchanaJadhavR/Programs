package ex_18052024_OOPs_Encapsulation;

public class SmartHome
{
 /*Let's consider a SmartHome system that encapsulates various components and their
   statuses, such as lights, thermostat, and security system. This example will 
    demonstrate how encapsulation helps to manage these components and control their
     access and modification.
  */


        private boolean lights_on; //= False       
	    private int  thermostat_temp; //= 72       
	    private boolean security_system; // false 
	    
	    
	    private static final boolean ON = true;
	    private static final boolean OFF = false;
	    
	    
	    SmartHome()
	    
	    {
	    	this.lights_on = OFF; 
	    	this.thermostat_temp = 72; 
	    	this.security_system = OFF;
	    	
	    }
	    

	    public boolean getlights_on()
	    {
	    	return lights_on;
	    }
	    

	    // Method to demonstrate the usage of if(Status == ON)
	    public void checkLightStatus() {
	        if (lights_on == ON) {
	            System.out.println("The lights are on.");
	        } else {
	            System.out.println("The lights are off.");
	        }
	    }

	    
    public void setlights_on(boolean Status)
    {
    	this.lights_on = Status;
    }
    
    public int getthermostat_temp()
    {
		return thermostat_temp;
    	
    }
    
    
    public void setthermostat_temp(int temp)
    {
      if(temp >= 50 && temp <= 90) 
      {
           this.thermostat_temp = temp;
           
           //System.out.println("  Thermostat Temperature: " + temp + "°F");
      }
      
      else 
      {
    	  
    	  System.out.println("Invalid temperature setting");
      }
      
      
}

}
