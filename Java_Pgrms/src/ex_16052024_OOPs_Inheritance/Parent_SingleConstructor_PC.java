 package ex_16052024_OOPs_Inheritance;

 //Can constructors be inherited in single-level inheritance? How?

//Constructors are not inherited, but the child class can call the parent class's constructor using the super keyword.

//using parameterized constructor(PC).

public class Parent_SingleConstructor_PC 

{
	
	//Parent class constructor
	Parent_SingleConstructor_PC (String name)
	

	{
		
		System.out.println("parent name: " + name);
	}

}


class child1 extends Parent_SingleConstructor_PC

{
   

//Child class constructor

  child1(String name, int age)
  {
	  super(name); //Call to the parent class constructor
	  
	  System.out.println("child name: " + "son of "+name);
	  System.out.println("child age: " + age );
	  
  }

}

   



//After the parent class constructor finishes, 
//control returns to the child class constructor.
//It prints child name: son of John.
//It prints child age: 25.
