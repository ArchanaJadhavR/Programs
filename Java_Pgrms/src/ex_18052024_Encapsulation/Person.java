package ex_18052024_Encapsulation;
import java.util.Scanner;

public class Person 

{
	    // Private attributes
	    private String name;
	    private int age;
	    
	    // Public getter for name
	    public String getName() {
	        return name;
	    }
	    
	    // Public setter for name
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    // Public getter for age
	    public int getAge() {
	        return age;
	    }
	    
	    // Public setter for age
	    public void setAge(int age) {
	        if (age > 0) { // Validation to ensure a positive age
	            this.age = age;
	        } else {
	            System.out.println(age +" : it is not valid, Please enter a valid age.");
	        }
	    }
	    
	    // Public method to display person's details
	    public void displayPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	    
	    // Main method for testing
	    public static void main(String[] args) {
	        Person person = new Person();
	        person.setName("John");
	        person.setAge(25);
	        person.displayPersonDetails();
	        
	        System.out.println("---------------------------------------");
 
	        person.setAge(-5); // Attempt to set an invalid age
	       
	        System.out.println("---------------------------------------");

	       person.setName("abc");
	       person.setAge(5); // Attempt to set an invalid age
	       person.displayPersonDetails();
	    
	    }
	
}
