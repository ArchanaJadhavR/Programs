 package ex_14052024_OOPs_Constructor;

public class Person
{
	String name;
	int age;
	
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println(name +" age is "+ age +" years");
	}

	public static void main(String[] args) 
	{
	
		Person P1 = new Person("Person_1", 10);
		   P1.display();
				
	  Person P2 = new Person("Person_2", 20);
			P2.display();
			   
	  Person P3 = new Person("Person_3", 30);
		   P3.display();
				   
				   
	}

}
