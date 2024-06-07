package HW_04052024;

//Reverse a String without using any function or using for loop.


public class Reverse_string {

	public static void main(String[] args) {
		
	

		
		
		String name = "JAVA";
		String reverse = " ";
        int length = name.length();


		int i = length - 1;
		
		while (i>=0)
		{
			reverse += name.charAt(i); 			
			i--;
			
			
		}
		
		
		System.out.println("original string :"+ name);
		System.out.println("reversed string :"+ reverse);
		
		
		
		System.out.println("======================");
		

		System.out.println("OR reversed string can also print using char data type");
		
		
	char ch1 = name.charAt(3);
	System.out.print(ch1);
	
	char ch2 = name.charAt(2);
	System.out.print(ch2);
	
	char ch3 = name.charAt(1);
	System.out.print(ch3);
	
	char ch4 = name.charAt(0);
	System.out.print(ch4);
}

}







		
    		
/* NOTE: 
 *reverse += name.charAt(i); the += operator is used for concatenation or addition depending on the context.
 * When used with strings, concatenates the right-hand side operand to the left-hand side operand.

In the expression reverse += name.charAt(i);,
assuming reverse is a string variable and name is another string variable
 here's what happens:
->name.charAt(i) retrieves the character at the i-th position in the string name.
->The retrieved character is concatenated to the current value of the reverse string variable.
->The result of the concatenation is then assigned back to the reverse variable.

*/

	


