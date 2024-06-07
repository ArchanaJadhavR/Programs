package ex_07052024_Functions;

public class pgrm01 {

	
	static int add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
		return c;
	}
	public static void main(String[] args) 
	{
		int r1 = add(2,3);
		int r = r1+5;
		
		System.out.println(r);
		
	}

}
