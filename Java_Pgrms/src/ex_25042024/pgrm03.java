package ex_25042024;

import java.util.Scanner;

//prgm for short profile update
public class pgrm03 {

	public static void main(String[] args)
	
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your Name");
		String Name = sc.nextLine();
		
		System.out.println("Enter your Age (it must be a positive number)");
		int Age = sc.nextInt();

		
		System.out.println("Enter your grade");
		char grade = sc.next().charAt(0);
		
		System.out.println("Enter your blood group");
		String blood_group = sc.nextLine();   //next() is correct here
		
		
		System.out.println("Enter your Salary");
		double Salary = sc.nextDouble();
		
		
		
		System.out.println("Name is :"+ Name);

		System.out.println("Age is :"+ Age);
		

		System.out.println("blood group is :"+ blood_group);

		System.out.println("grade is :"+ grade);
		
		System.out.println("Salary is :"+ Salary);
		
		
		
		
		
		sc.close();
		
		
	}

}
