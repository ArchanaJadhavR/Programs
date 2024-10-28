package ex_18052024_OOPs_Encapsulation;

public class ICICIBank_mainclass {

	public static void main(String[] args)
	{
             ICICIBank B = new ICICIBank("ABC", 0);
             
 			System.out.println("Account Holder Name: " + B.getName());
 			
 			B.setBalance(-0);
 			
			System.out.println("Balance: "+ B.getBalance());
             
		
	}

}
