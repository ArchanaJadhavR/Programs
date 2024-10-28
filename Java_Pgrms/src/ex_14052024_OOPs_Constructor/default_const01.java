package ex_14052024_OOPs_Constructor;

//A constructor is called "Default Constructor" when it doesn't have any parameter.

//In this example, we are creating the no-arg constructor in the default class. It will be invoked at the time of object creation.

public class default_const01 
{

	//Java Program to create and call a default constructor  
	  
	//creating a default constructor  
	default_const01()
	
	{System.out.println("default_const01 is created");}  
	
	//main method  
	
	public static void main(String args[]){  
	
		//calling a default constructor 
		
		default_const01 DC = new default_const01();  
	}  
	}  
	

