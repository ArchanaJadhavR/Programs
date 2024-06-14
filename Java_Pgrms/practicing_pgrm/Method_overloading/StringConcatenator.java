package Method_overloading;

public class StringConcatenator 
{
	// Method to concatenate two strings

   static String Concatenator (String a, String b)
   { 
	   return a+b;
   }
	
   // Method to concatenate three strings
   static String Concatenator (String a , String b, String c)
   {
	   return a+b+c;
   }

// Method to concatenate a string and an integer
   
   static String Concatenator (String a , int b)
   {
	   return a+b;
   }


public static void main(String[] args) {
    System.out.println(Concatenator("Hello, ", "World!"));       // Output: Hello, World!
    System.out.println(Concatenator("Hello, ", "World", "!"));   // Output: Hello, World!
    System.out.println(Concatenator("Number: ", 100));           // Output: Number: 100
}
}

