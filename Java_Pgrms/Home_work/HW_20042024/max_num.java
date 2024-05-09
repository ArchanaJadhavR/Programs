package HW_20042024;

//find max number between 3 number using ternary operator.


public class max_num {

public static void main(String[] args) {
		
	int num1 = 40;
        int num2 = 10;
        int num3 = 20;
        
        int max = num1;

        if (num2 > max)
            max = num2;

        if (num3 > max)
            max = num3;

        System.out.println("The maximum number is: " + max);
    }

}
