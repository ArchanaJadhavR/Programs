package ex_07052024_Functions;

public class pgrm06 {
    public static void main(String[] args)
    
{
        // Function - Which we greet the user
        // Name -> Hello Pramod
        sayHello("Pramod");

        // Non Return with no parameter
        // Non return with parameter
        // Return with no parameter
        // Return with parameter

        String N = great("hello java");
        
        System.out.println(N);//with return type 

    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name);//without return type
    }



    	
    	static String great (String name)
    	{
    		return name;
    	}
    }