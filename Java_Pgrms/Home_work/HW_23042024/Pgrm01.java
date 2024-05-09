package HW_23042024;

import java.util.Scanner;

public class Pgrm01 {

	public static void main(String[] args) {

		//Pgrm is to check no is positive, negative or zero.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
        int num = sc.nextInt();
        
       // double num = sc.nextDouble();
        
        if(num<0)
        {
        	System.out.println("number is negative");
        }
        
        else if(num>0)
        {
        	System.out.println("number is positive");
        }
        
        else
        {
        	System.out.println("number is zero");
        
        }
        
        
        sc.close();
		
	}

}
