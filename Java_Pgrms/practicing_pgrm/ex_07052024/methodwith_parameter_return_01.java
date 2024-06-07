package ex_07052024;


public class methodwith_parameter_return_01 {

	public static void main(String[] args) 
	{
		int result = add(4,6);
		System.out.println(result);
	}
	
	
	static int add(int a, int b)
	{
		int c = a+b;
		return c;
	}

}
