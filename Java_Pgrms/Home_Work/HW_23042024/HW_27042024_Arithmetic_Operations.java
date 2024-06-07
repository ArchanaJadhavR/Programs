package HW_23042024;

import java.util.Scanner;

/*Take a input from user, input1, input2 as int and ask the user what you want to do,
enter char +,*,/ ,%, - , you will share the result by using the switch.*/

public class HW_27042024_Arithmetic_Operations {

	public static void main(String[] args) 
	
	{
 
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
		System.out.println("Which operation do you want to perform?");
        char ch = sc.next().charAt(0);
        double result;
        switch (ch) {
            case '*':
               result =num1*num2;
               System.out.println("The result of " + num1 + " * " + num2 + " is " + result);
                break;
            case '+':
              result  =num1+num2;
              System.out.println("The result of " + num1 + " + " + num2 + " is " + result);
                break;
            case '-' :
                result = num1-num2;
                System.out.println("The result of " + num1 + " - " + num2 + " is " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of " + num1 + " / " + num2 + " is " + result);
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("The result of " + num1 + " % " + num2 + " is " + result);
                } else {
                    System.out.println("Error: Modulous by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        sc.close();
    }


}


/* 
 {
        // Program to Perform Arithmetic Operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int input1 = sc.nextInt();
        System.out.println("Enter num2");
        int input2 = sc.nextInt();
        System.out.println("Enter Operation +,-,%,/,*");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Result: " + (input1 + input2));
                break;
            case '-':
                System.out.println("Result: " + (input1 - input2));
                break;
            case '*':
                System.out.println("Result: " + (input1 * input2));
                break;
            case '%':
                System.out.println("Result: " + (input1 % input2));
                break;
            case '/':
                System.out.println("Result: " + (input1 / input2));
                break;
            default:
                System.out.println("Invalid operator");


        }

        sc.close();


    }
}

 */


