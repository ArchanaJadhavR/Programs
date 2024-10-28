package ex_14052024_OOPs_Constructor;

/*
 this shows how to use a default constructor to create 'car1' object with
 a default attribute value. 
 */

public class Car1 {

	
		    // Instance variables
		    private String make;
		    private String model;
		    private int year;

		    // Default constructor
		    public Car1() {
		        make = "Unknown";
		        model = "Unknown";
		        year = 0;
		    }

		 public static void main(String[] args) 
		 {
		   // Creating a car object using the default constructor
		       
			 Car1 mc = new Car1();
		System.out.println(mc.make);
		System.out.println(mc.model);
		System.out.println(mc.year);
		
		 }
		
		
	}


