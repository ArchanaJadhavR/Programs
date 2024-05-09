package ex_23042024;

public class Sides {

	public static void main(String[] args) {
		
		int side1 = 20;
		int side2 = 30;
		int side3 = 10;
		
		if(side1 == side2 && side2 == side3 && side1 == side3)
		{
			System.out.println("It is a Traingle");
		}
		
		else if (side1 != side2 && side2 !=side3 && side1 != side3)
		{
			System.out.println("It is a Scalene");
			
		}
		
		else
			
		{
			System.out.println("It is a Isosleles");
			
		}
	}

}
