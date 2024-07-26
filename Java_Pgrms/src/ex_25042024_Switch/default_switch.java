package ex_25042024_Switch;

public class default_switch {

	public static void main(String[] args) {
		
        int a = 11;
        
        
        switch (-1) //we can also write as (1+2+3)
        {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");
                break;
        }

        System.out.println();
        //sysout ->short cut for print statement
    }

	}


