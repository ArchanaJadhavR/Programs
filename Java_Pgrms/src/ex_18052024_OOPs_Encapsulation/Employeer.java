package ex_18052024_OOPs_Encapsulation;

public class Employeer 
{
	private int Empid;
	private String Name;
	private String Designation;
	private double Salary;
	//private double incremented_Salary;
	
	
	Employeer(int Empid, String Name, String Designation, double initialSalary)
	{
		this.Empid = Empid;
		this.Name = Name;
		this.Designation = Designation;
		this.Salary = initialSalary;
		
		if(initialSalary<=0)
			
		{
			//this.Salary = initialSalary;
			System.out.println("Employee initial Salary: NULL");
		}
			
	}
	
	public void increment(double inc_per)
	{
		
	    
		if(Salary<=300000 && Salary>0)
			
		{
			double inc_amount = inc_per*Salary;
			Salary = inc_amount+Salary;
			
			//Salary += inc_amount;
			
		    System.out.println("Salary got incremented: "+inc_amount);
		}
		
		else
		{
			System.out.println("No increment");
		}
	}
	
   
	public int getEmpid()
	   {
		   return Empid;
	   }
		
	   public String getName()
	   {
		   return Name;
	   }
		
	   public String getDesignation()
	   {
		   return Designation;
	   }
		
	   public double getSalary()
	   
	   {
		   return Salary;
	   }
	   
	   

		public void setEmpid(int Empid)
		   {
			   this.Empid = Empid;
		   }
			
		   public void setName(String Name)
		   {
			   this.Name = Name;
		   }
			
		   public void  setDesignation(String Designation)
		   {
			   this.Designation = Designation;
		   }
			
		   public  void setSalary(double Salary)
		   {

				if(Salary>0)
				{	   this.Salary = Salary;
				
				}
				else	
				{
					
					System.out.println("Employee initial Salary: NULL");
				}
				
				
			}
		  
}
		
		   

