package ex_21052024_OOPs_Abstraction;
/* Question: Write a Java program to demonstrate abstraction. 
 * Create an abstract class Vehicle with an abstract method start().
 *  Create two subclasses Car and Bike that implement the start() method.*/

abstract class Vehicle 

{
	public abstract void start();
	

}

class Car extends Vehicle
{

	@Override
	public void start() 
	{
	
		System.out.println("car has started");
	}
	
	}

class Bike extends Vehicle
{

	@Override
	public void start()
	{
		System.out.println("Bike has started");
				
	}
	}
