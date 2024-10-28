package ex_18052024_OOPs_Encapsulation;

public class Employee 
{
	
	private String emp_name;
	private double emp_salary;
	
	
	Employee(String emp_name, double emp_salary)
	{
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	
	public String getemp_name() 
	
	{
		return emp_name;
	}

    public double getemp_salary()
    {
    	return emp_salary;
    }

    
    public void setemp_name (String emp_name)
    {
    	 this.emp_name = emp_name;
    }
    
    // Setter for salary with validation
    public void setemp_salary(double emp_salary)
    {
        if (emp_salary > 0)
        {
            this.emp_salary = emp_salary;
        }
        else
        {
            System.out.println("Invalid salary. Salary must be positive.");
        }
    }

    
    /*
    
    public int setemp_salary(int emp_salary)
    {
       return this.emp_salary	= emp_salary;
    }
    
    */
}
