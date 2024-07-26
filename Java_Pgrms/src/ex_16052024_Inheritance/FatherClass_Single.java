package ex_16052024_Inheritance;

public class FatherClass_Single {

	public static void main(String[] args) 
	{
//Father_Single F: An instance of Father_Single is created, and its home method is called,
//which prints "Father has 2BHK".
		   
		Father_Single F = new Father_Single();
				F.home();
				
//Father_Single S:An instance of sister is created and assigned to a variable of type Father_Single. 
//The home method from Father_Single is called on this instance, which prints "Father has 2BHK"

	 Father_Single S = new sister();
			S.home();

//brother B: An instance of brother is created, and its home1 method is called, which prints "brother has 3BHK".
//Afterward, its inherited home method is called, which prints "Father has 2BHK".
	  brother B = new brother();
	         B.home1();
	         B.home();
	
	}

}
