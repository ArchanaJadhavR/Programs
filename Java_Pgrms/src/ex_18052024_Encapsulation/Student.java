package ex_18052024_Encapsulation;

import java.util.ArrayList;
import java.util.List;

/* Imagine you are designing a class for a Student entity that includes attributes such 
 as the student's name, age, and grades. Implement the class using encapsulation 
 principles, ensuring that:

->The name attribute can only be set during object creation and cannot be changed later.
->The age attribute can be updated, but it must always be a positive integer.
->The grades attribute should be a list, and there should be methods to add a grade,
 remove a grade The grades must be between 0 and 100.
*/


public class Student 

{
	private String std_name;
	private int std_age;
	private List<Integer> std_grades;
	
	Student(String std_name, int std_age)
	{
		this.std_name = std_name;
		setstd_age(std_age);
		std_grades = new ArrayList<>();
	}
	
    // Getter for name

	public String getstd_name()
	{
		return std_name;
		
	}
	
    // Getter for age

	public int getstd_age()
	{
		return std_age;
		
	}
	
    // Setter for age

	public void setstd_age(int age)
	{
		if (age > 0 )
		{
		
			this.std_age = age;
		}
		else
		{
			System.out.println("invalid age number");
            //throw new IllegalArgumentException("Age must be a positive integer.");

			}

	}
	
	
    // Getter for grade

	public List<Integer> getstd_grades()
	{
		return std_grades;
		
	}
	
    // Method to add a grade

	public void add_grade (int grades)
	{
		if(grades >=0 && grades <=100)
		{
			std_grades.add(grades);
			
			}
		
		else
		{
			
			System.out.println("Grade must be between 0 and 100.");
		
		}
	}
	
    // Method to remove a grade

	public void remove_grade(int grade)
	{
		if(std_grades.contains(grade))
		{
			std_grades.remove(Integer.valueOf(grade));
            
		}
	 else
	 {
        throw new IllegalArgumentException("Grade not found in the list.");
    }
		
	}
	
	
}
