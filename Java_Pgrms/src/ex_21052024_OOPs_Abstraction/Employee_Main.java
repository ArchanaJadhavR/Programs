package ex_21052024_OOPs_Abstraction;


public class Employee_Main {

	public static void main(String[] args)
	{
	
		FTEmployee FT = new FTEmployee("abc", 35000);
		System.out.println(FT.name +" salary is : " + FT.calculateSalary());
		
		PTEmployee PT = new PTEmployee("Bob", 20, 150);
		System.out.println(PT.name + " salary is : " + PT.calculateSalary());
		
		
		
		
	}

}
