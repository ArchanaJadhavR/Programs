package ex_14052024_Constructor;

public class BankAccount
{

	    String bankName;
	    int balance;
	    String bankCode;

	    BankAccount()
	    {
	        bankName = "SBI";
	        bankCode = "SBI001";
	        balance= 0;
	    }

	    BankAccount(int balance, String bankCode,String bankName) 
	    {
	        this.bankName = bankName;
	        this.balance = balance;
	        this.bankCode = bankCode;
	    }

	    BankAccount(String bankName, String bankCode) 
	    {
	        this.bankName = bankName;
	        this.bankCode = bankCode;
	    
	    }
	    
	    void printDetails() {
	        System.out.println("Bank Name -> " + bankName);
	        System.out.println("Bank Code -> " + bankCode);
	        System.out.println("Bal ->" + balance);
	        
	        System.out.println(" ");
	    }

	    public static void main(String[] args) {

	        BankAccount sbi_ref = new BankAccount();
	        sbi_ref.printDetails();

	        BankAccount hdfc_ref = new BankAccount(10,"HDFC001","HDFC");
	        hdfc_ref.printDetails();

	        BankAccount icici_ref = new BankAccount(20,"icici003","ICIC");
	        icici_ref.printDetails();

	        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
	        yesbank_ref.printDetails();

	    }
	}


	
