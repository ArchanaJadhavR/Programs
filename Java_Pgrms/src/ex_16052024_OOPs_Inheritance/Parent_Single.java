package ex_16052024_OOPs_Inheritance;

//How do you override a method in single-level inheritance?
public class Parent_Single

{
	//It has a method parentmethod that prints "This is a Parent method" to the console
	void parentmethod()
	{
		System.out.println("This is a Parent method");
	}
	
}


class Child_Single extends Parent_Single
{
	//This class Child_Single inherits from Parent_Single.
	//it has an additional method childmethod that prints "This is a child method" to the console.
	//child class prints latest one if it does have a method.
	void childmethod()
	{
		System.out.println("child method is overriden");
	}
}

