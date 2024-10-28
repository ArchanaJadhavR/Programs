package ex_16052024_OOPs_Inheritance;

public class Vehicle {
	Vehicle(){
        System.out.println("DC Vehicle");
    }

	void vehicleHasTopSpeed() {
		System.out.println("Yeah from " + getClass().getSimpleName());
	}

}
