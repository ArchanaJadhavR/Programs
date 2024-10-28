package ex_16052024_OOPs_Inheritance;

public class Grandfather_multilevel 
{
	void home()
	{
		System.out.println("GF has 1bhk");
	}

}

class Father extends Grandfather_multilevel
{
   void home1()
   {
		System.out.println("Father has 2bhk");

   }
}

class CHILD extends Father
{
   void home2()
   {
		System.out.println("Child has 3bhk");

   }
}