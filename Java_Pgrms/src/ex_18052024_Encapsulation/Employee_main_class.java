package ex_18052024_Encapsulation;

public class Employee_main_class {

	public static void main(String[] args) 
	{
		Employee Emp = new Employee("Jhon", 50000);
		

		
		System.out.println("Employee name: "+Emp.getemp_name());
		System.out.println("Employee salary: "+Emp.getemp_salary());
		
		

		System.out.println("=================================");
		
        // Using setters to update fields
		
        Emp.setemp_salary(-60000);
        
        Emp.setemp_name("Jane Doe");
        Emp.setemp_salary(65800.900);
        
       
        
        // Using getters to access fields

		System.out.println("updated Employee name: "+Emp.getemp_name());
		System.out.println("updated Employee salary: "+Emp.getemp_salary());
		
	}

}
