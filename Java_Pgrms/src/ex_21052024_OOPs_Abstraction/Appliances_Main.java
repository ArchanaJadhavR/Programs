package ex_21052024_OOPs_Abstraction;

public class Appliances_Main {

	public static void main(String[] args) 
	{
	
		WashingMachine wm = new WashingMachine(true);
		
		wm.turnOn();
		wm.operate();
		wm.turnOff();
		
		System.out.println("***********************");	
		
		Refrigerator R = new Refrigerator(false);
		
		R.turnOn();
		R.operate();
		R.turnOff();
	}

}
