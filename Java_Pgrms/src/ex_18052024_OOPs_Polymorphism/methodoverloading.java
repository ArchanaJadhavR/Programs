package ex_18052024_OOPs_Polymorphism;

public class methodoverloading 
{
	methodoverloading()//constructor->DC
	{

	    }
	methodoverloading(int a){

	    }
	methodoverloading(int a, int b){

	    }
	methodoverloading(int a, String b){

	    }


	    // Method OverLoading -> multiple methods with same name, but different argument.
	    // order also matters

	    void Gift(String A){
	        System.out.println("A is a String: " +  A);
	    }


	    int Gift(float B){
	        System.out.println("B is a float: " +  B);
	        return 89;
	    }

	    void Gift(double C){
	        System.out.println("C is a double: " +  C);
	    }
	    

	    static int Gift(int D){
	        System.out.println("D is a Int: " +  D);
	        return D;
	    }

	  /*  void a(int pramod,float amit){

	    }
	    void a(float y,int x){

	    }*/

	    public static void main(String[] args) 
	    {
	    	methodoverloading p = new methodoverloading();
	    	
	        p.Gift("Pramod");
	        p.Gift(54.67f);
	        p.Gift(10.54);      
	        
	  methodoverloading.Gift(10); //we can call directly to mehtod use static for method
	    }
	}



