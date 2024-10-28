package ex_21052024_OOPs_Abstraction;

public class Main_Browser {

	public static void main(String[] args) 
	{
	
		TC1_CHROME C = new TC1_CHROME();
		C.openBrowser();
		C.closeBrowser();
		

		TC2_FIREFOX F = new TC2_FIREFOX();
		F.openBrowser();
		F.closeBrowser();
		
		
	}

}
