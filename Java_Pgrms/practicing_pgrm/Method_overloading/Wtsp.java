package Method_overloading;

public class Wtsp 
{
	static void send(String a)
	{
		System.out.println(a);
	}

	static void send(int b)
	{
		System.out.println(b);
	}

	
	static void send(String a, int b)
	{
		System.out.println("wtsp text: " + a +" " + "wtsp number: " + b);
		
		//System.out.println( a + b);
	}

	public static void main(String[] args) 
	{
	   send("hi");	
	   send(1234);
	   send("my", 123);
	}

}
