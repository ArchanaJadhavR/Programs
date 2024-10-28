package ex_21052024_OOPs_Abstraction;

//Abstract class
abstract class Animal {
 // Abstract method (does not have a body)
 public abstract void sound();

 // Regular method
 public void eat() {
     System.out.println("This animal is eating.");
 }
}

//Subclass (inherits from Animal)
class Dog extends Animal {
 public void sound() {
     System.out.println("The dog barks.");
 }


}

	

	
	

