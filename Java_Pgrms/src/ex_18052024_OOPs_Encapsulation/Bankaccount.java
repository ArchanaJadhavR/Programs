package ex_18052024_OOPs_Encapsulation;

public class Bankaccount 
{
	private String Name;
	private int ACC_number;
	private double Balance;
	
Bankaccount(String Name, int ACC_number, double initialbalance)
{
	this.Name = Name;
	this.ACC_number = ACC_number;
	
	if (initialbalance>0)
		
	{
	
	this.Balance = initialbalance;
	
	}
	else
	{
		this.Balance = 1000; // Setting a default minimum balance
        System.out.println("Insufficient balance. Minimum balance should be 1000.");
    }
	
}	
	
	
public void deposit(double amount)
{
     	if(amount>0)
     	{
     		Balance += amount;
     		System.out.println("amount is deposited as: "+amount);
     	}
     	else
     	{
     		System.out.println("amount is not deposited, balance is same as initial balance");
     	}
}


public void withdraw(double amount)
{
  if(amount>0 && amount <= Balance ) 
  {
	   Balance -= amount;
	  System.out.println("withdrawal amount: "+ amount );
	}
	else
	{
		System.out.println("Invalid withdrawal amount.");
	}
	  
  }




	public String getName()
	{
		return Name;
	}
	
	public int getACC_number()
	{
		return ACC_number;
	}

	
	public double getBalance()
	{
		return Balance;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	/*public String setName(String Name)
	{
		return Name;
	}
*/
}
