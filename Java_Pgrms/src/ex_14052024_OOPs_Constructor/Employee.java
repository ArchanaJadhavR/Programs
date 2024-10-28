package ex_14052024_OOPs_Constructor;

public class Employee 
{
	String Emp_name;
	int Emp_id;
	
	Employee(String Emp_name, int Emp_id)
	{
		this.Emp_name = Emp_name;
		this.Emp_id = Emp_id;
	}

	public void display()
	{
		System.out.println(Emp_name+" and "+ Emp_id);
	}
	
	public static void main(String[] args)
	{
		Employee E1 = new Employee ("ABC", 123);
				E1.display();
				

		Employee E2 = new Employee ("CDE", 345);
				E2.display();
						

		Employee E3 = new Employee ("DEF", 567);
				E3.display();
		
	}

}
