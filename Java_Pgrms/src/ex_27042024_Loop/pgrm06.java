package ex_27042024;

public class pgrm06 {

	public static void main(String[] args) {
		
		System.out.println("Print the value of i, but I want to break when i = 5");

        for (int i = 1; i <= 10; i++) {
            //System.out.println("Val of "+ i); ->print after the condition
            if( i ==5){
                break;
            }
            System.out.println("Val of "+ i); //print after the condition
        }

        System.out.println("End");

    }

	}

