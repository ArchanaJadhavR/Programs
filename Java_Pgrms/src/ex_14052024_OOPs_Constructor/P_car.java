package ex_14052024_OOPs_Constructor;

/** write a class car that has a default constructor
 which initialize the make to "unknown" and year to "0"
 Also, provide a parameterized constructor that allows setting both make and year **/
 
public class P_car {
	
	String make;
	int year;
	
	//default constructor
	P_car()
	{
		make = "unknown";
	    year = 0;
	}
	
	//parameterized constructor
	P_car(String M, int Y)
	{
		make = M;
		year = Y;
	}

	//method to display
	
	public void display()
	{
		System.out.println(make +" and "+ year);
	}
	
	//main method
	public static void main(String[] args)
	{

		System.out.println("default constructor value");
		
        P_car C = new P_car(); //default constructor
         C.display();
         

 		System.out.println("parameterized constructor value");
 		
         P_car C1 = new P_car("Toyota", 2022); //parameterized constructor
          C1.display();
          

          P_car C2 = new P_car("Toyota", 2023); //parameterized constructor
           C2.display();
          
         

	}

}
