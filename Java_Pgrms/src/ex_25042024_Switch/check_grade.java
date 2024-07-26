package ex_25042024_Switch;

import java.util.Scanner;

// Determine grade based on marks using a switch statement


public class check_grade {

	public static void main(String[] args) 
	{
	
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the marks");
		 
		 int marks = sc.nextInt();
		 
		 switch(marks/10)
		 {
		 case 9: System.out.println('A');
		  break;
		  
		 case 8: System.out.println('B');
		  break;
		  
		 case 7: System.out.println('C');
		  break;
		  
		 case 6: System.out.println('D');
		  break;
		  
		 default: System.out.println('F');
		  
		  
		 
		   
		 }

	}

}
