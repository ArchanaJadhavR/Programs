package ex_18052024_superthiskeyword;

public class Super_02
{

	public static void main(String[] args)
	{

           Student s = new Student();
              s.display();
              
           
	}

}
	class Student extends Person
	{
		// is A relation - inheritance
		
		void message()
		
		{
			System.out.println("i m a student");
		}
		


	    void display(){
	        this.message(); //use to call itself
	        super.message(); //use to call parent class
	    }

	}
	
	
	class Person
	{
		void message()
		{
			System.out.println("i m a person");
		}	
		
	}
	



