package ex_18052024_OOPs_Encapsulation;

//to set balance shouldn't be go as below 0

// Private
// Use Setter and Getter with Condition to secure your data members by methods
// hide the data members - ecap


public class ICICIBank
{
	private String Name;
	private long Balance;
	
	ICICIBank(String Name, long Balance)
	{
		this.Name = Name;
		this.Balance = Balance;
		
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}

	
	public long getBalance()
	
	{
		return Balance;
	}
	
	public void setBalance (long Balance)

	{
		if(Balance>0)
		{
		this.Balance = Balance;
		
		//System.out.println("not sufficent Balance");
	}
		
		else
		{
			System.out.println("not sufficent Balance");
		}
	}
}
