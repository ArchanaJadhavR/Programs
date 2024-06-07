package HW_02052024;

import java.util.Scanner;

//Create a Program which takes arrays and print all the marks.

public class marks {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the total count of marks:");
	     int count = sc.nextInt();
	   
	     float marks []= new float[count];
	     // Use the count variable to dynamically allocate space

	      
 /*
float marks []= new float[4];// Use the count variable to fixed allocate space
	      
	       System.out.println("Enter the marks 1:");
	          marks[0] = sc.nextFloat();
	          System.out.println("Enter the marks 2:");
	          marks[1] = sc.nextFloat();
	          System.out.println("Enter the marks 3:");
	          marks[2] = sc.nextFloat();
	          System.out.println("Enter the marks 4:");
	          marks[3] = sc.nextFloat();
	          System.out.println("Enter the marks 5:");
	          marks[4] = sc.nextFloat();
                 */
	          
		   for(int j = 0; j<count; j++)
		   {
			   System.out.println("enter the marks" + (j));
		         marks[j] = sc.nextFloat();

		   }
	
	        for (int i = 0; i<marks.length; i++)
	        {
	        			        
	        System.out.println("marks " + (i)+ ": " + marks[i]);
	        }
	        
		      System.out.println("Total count of marks: " + count);
	        sc.close();
	
	}
}


