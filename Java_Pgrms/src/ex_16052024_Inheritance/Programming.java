package ex_16052024_Inheritance;

public class Programming 
{
   int Version;
   String Author;
   
   //default constructor
   
   Programming()
   {
	   System.out.println("It's DC for Programming class");
   }
   
   //Parameterized constructor
   
   Programming(int Version, String Author)
   {
	   this.Version = Version;
	   this.Author = Author;
   }

   //print information for 
   void printinfo()
   {
	   System.out.println("Program Version is " + Version +" and Author is "+ Author);
   }
}

class java extends Programming
{
	String newfeature;
	
	//default constructor
	
	java()
	{
		  System.out.println("It's DC for java class");
	}
	
	   //Parameterized constructor

	java (int Version, String Author, String newfeature)
	{
		super(Version, Author);
		this.newfeature = newfeature;
	}
	
	   //print information for java class
	   void printinfo()
	   {
	        super.printinfo(); // Call parent class method to print version and author

		   System.out.println("new  Feature is ->" + newfeature);
	   }

}





