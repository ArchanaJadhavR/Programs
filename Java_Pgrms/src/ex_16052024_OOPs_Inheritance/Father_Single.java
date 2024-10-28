package ex_16052024_OOPs_Inheritance;

public class Father_Single
{
	void home()
	{
		System.out.println("Father has 2BHK");

	}

}

class sister extends Father_Single
{
//It does not add any new methods or properties;
	//it simply inherits everything from Father_Single.
}

class brother extends Father_Single

//This class brother also inherits from Father_Single.
//It adds a new method home1 that prints "brother has 1BHK" to the console.

{
	void home1()
	{
		System.out.println("brother has 3BHK");

	}
}