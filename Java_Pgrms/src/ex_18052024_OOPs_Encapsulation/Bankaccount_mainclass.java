package ex_18052024_OOPs_Encapsulation;

public class Bankaccount_mainclass {

	public static void main(String[] args) 
	{
		
		Bankaccount account = new Bankaccount("jhon", 1234567, 0);
		
		System.out.println("Account holder name: "+account.getName());
		System.out.println("Account number: "+account.getACC_number());
		System.out.println("current balance status: "+account.getBalance());
		
		System.out.println("       ");	
		
		account.deposit(5000);
		System.out.println("balance after deposited: " + account.getBalance());
		
		System.out.println("       ");
		
        account.withdraw(1000);
		System.out.println("balance after withdrawal: " + account.getBalance());
		
		System.out.println("       ");
		
        
           account.setName("abc");
           System.out.println("Updated Account holder name: "+account.getName());

		
	}
}