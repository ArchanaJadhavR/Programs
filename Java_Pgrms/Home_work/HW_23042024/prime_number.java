package HW_23042024;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character");
		
	int num = sc.nextInt();
			
int i;
		
		for (i=2; i<=num; i++)
			
		{ 
			if(num%i == 0)
		

		{
			System.out.println("it is a prime number");
			
		}
	
			else 
			
		{
			System.out.println("it is not a prime number");
			
		}
	}
	
	}
}
