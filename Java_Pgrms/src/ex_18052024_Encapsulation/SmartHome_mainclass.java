package ex_18052024_Encapsulation;

public class SmartHome_mainclass {


	
	public static void main(String[] args) {
		
		
        SmartHome Home = new SmartHome();

		
		System.out.println("Smart Home Status:");
		
        Home.checkLightStatus();

		//Home.setlights_on(ON);
        System.out.println("  Lights On: " + Home.getlights_on());
        
        Home.setthermostat_temp(100);
        
        System.out.println("  Thermostat Temperature: " + Home.getthermostat_temp() + "°F");
        //System.out.println("  Security System Armed: " + securitySystemArmed);
		
	}

}
