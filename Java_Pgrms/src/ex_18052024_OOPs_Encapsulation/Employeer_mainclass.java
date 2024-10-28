package ex_18052024_OOPs_Encapsulation;

public class Employeer_mainclass {

	public static void main(String[] args) 
	{
		
		Employeer emp = new Employeer(1, "Jhon", "Intern", 150000);
		
		System.out.println("Empoyee Id: "+emp.getEmpid());
		System.out.println("Empoyee Name: "+emp.getName());
		System.out.println("Employee designation: "+emp.getDesignation());
		System.out.println("Employee Salary: "+emp.getSalary());
		emp.increment(0.4);
		System.out.println("Current Salary of Employee: " +emp.getSalary());
	

		System.out.println("        ");
		System.out.println("***New employee detail***");
		
		
		 emp.setEmpid(2);
	        emp.setName("Mohan");
	        emp.setDesignation("Senior Intern");
	        emp.setSalary(250000);

	        System.out.println("Employee Id: " + emp.getEmpid());
	        System.out.println("Employee Name: " + emp.getName());
	        System.out.println("Employee Designation: " + emp.getDesignation());
	        emp.increment(0.3);
	        System.out.println("Current Salary of Employee: " + emp.getSalary());
	
		

		
		
		
		
	}

}
