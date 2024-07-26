package ex_16052024_Inheritance;

//using Super keyword.

//Super keyword is use in case of method overriding.

//when ever we need along with subclass implementation with super class implementation the use Super Keyword..

public class Parent_SingleSuper 
{ 
	    void display() {
	        System.out.println("Parent display");
	    }
	}

	class Child_SingleSuper extends Parent_SingleSuper 
	
	{
	    @Override
	    void display() 
	    
	    {
//here we need both parents and child class implementation so we r using Super keyword.
//Syntax of super keyword -> Super.method_name
	    	
	        super.display();
	        System.out.println("Child display");
	    }
	

	}
	
//If the super keyword is not used, the overridden method in the child class will completely 
//replace the method in the parent class, and the parent class's method will not be called.