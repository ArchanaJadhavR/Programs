package HW_23042024;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {

		//prgm to check leap year ->2024.
		
		
		//According to the Gregorian calendar:

			//Years divisible by 4 are leap years, except for...
			//Years divisible by 100 are not leap years, except for...
			//Years divisible by 400 are leap years.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year");
		
		int year = sc.nextInt();
		
		if(year%4 == 0 && (year%100 != 0 || year%400 == 0))
		{
			System.out.println("It is a leap year");
		}
		
		else
		{
			System.out.println("It is not a leap year");
		}
			
sc.close();
	}

}
