package ex_21052024_OOPs_Abstraction;
/* Question: Create an abstract class Employee with an abstract method calculateSalary().
 *  Implement two subclasses FullTimeEmployee and PartTimeEmployee that provide specific
 *  implementations for salary calculation. Assume full-time employees have a fixed salary
 *   and part-time employees are paid hourly.*/

abstract class Employee 

{
	String name;
	
	Employee(String name)
	{
		this.name = name;
	}
	abstract double calculateSalary();

}

class FTEmployee extends Employee
{
       private double fixedsalary;
        
	FTEmployee(String name, double fixedsalary) 
	{
		super(name);
		this.fixedsalary = fixedsalary;
	}

	@Override
	double calculateSalary() 
	{
		return fixedsalary;
	}

}
class PTEmployee extends Employee	
{
    private int hourlyworked;
    private double hourlypaid;
	
	PTEmployee(String name, double hourlypaid, int hourlyworked) 
	{
		super(name);
		this.hourlyworked = hourlyworked;
		this.hourlypaid = hourlypaid;
	
	}

	@Override
	double calculateSalary() 
	{
		return hourlyworked * hourlypaid;
	}
	
}
	
	
	
