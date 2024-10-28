package ex_16052024_OOPs_Inheritance;

//multilevel inheritance it acts as a Child

	public class Test extends BaseTest {

	    void accessExcelAndSQL(){
	        openExcelFile();
	        openSQLConnection();
	        System.out.println(API_VERSION);
	        System.out.println(VERSION);
	    }

	    void openJSON(){
	        System.out.println("Test");
	    }
	}



