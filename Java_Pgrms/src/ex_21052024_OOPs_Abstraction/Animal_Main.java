package ex_21052024_OOPs_Abstraction;

public class Animal_Main 
{
		 public static void main(String[] args) {
		     // Cannot instantiate the abstract class
		     // Animal animal = new Animal(); // This will give an error

		     // Create a Dog object and call its methods
		     Dog myDog = new Dog();
		     myDog.sound(); // Outputs: The dog barks.
		     myDog.eat();   // Outputs: This animal is eating.
		 
	}


}
