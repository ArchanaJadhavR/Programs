package ex_07052024;

//add two num using method with return type.

public class methodwith_return_01 {

	public static void main(String[] args) 
	{
		 int result = add();
		 
		 System.out.println(result);
		
	}

	static int add()
	{
		int a = 2;
		int b = 2;
		int c = a+b;
		return c;
	}
}
