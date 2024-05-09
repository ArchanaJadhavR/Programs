package HW_23042024;

import java.util.Scanner;

//Find the largest number among three number by using if loop.
public class pgrm02 

{

	public static void main(String[] args) 
	{
		

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
      
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();
    
    int largest = num1;
    
    if (num2>largest)
    	
    	largest = num2;
    
    if(num3>largest)
    	
    	largest = num3;
    
    {
    	System.out.println("The largest number among the three number is "+ largest);
    }
    
    sc.close();
	}
	

}
