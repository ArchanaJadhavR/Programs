package HW_23042024;

import java.util.Scanner;

public class fizzbuzz {

	/* Write a program that prints numbers from 1 to 100 However, 
	for multiplies of 3, prnt "fizz" instead of the number, and for multiplies of 5, 
	print "Buzz." For number that are multiples of both 3 and 5,print "FizzBuzz"*/

	public static void main(String[] args)
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int num = sc.nextInt();
		
	
	    {

		if(num%3 == 0 && num%5 == 0 )
		{
			System.out.println("fizzbuzz");
		}
		
		else if(num%3 == 0 )
		{
			System.out.println("fizz");
		}
		
		else if(num%5 == 0 )
		{
			System.out.println("buzz");
		}
		
		else
			
		{
			System.out.println("number is " + num);
			
		}
		
	}
	    
	}
	
}
