package ex_23042024;

public class pgrm04 {

	public static void main(String[] args) {
		

        boolean a = true;
        a = !a;
        
        System.out.println(a);
        
        System.out.println("----------------");
        
        if(2+2 >= 4){  // 4 > 4 or 4 == 4 -> true - OR GATE
            System.out.println("Inside the loop code will be execute when the condition is true");
        }

        System.out.println("This is outside the loop, it will be executed always"+a);
            //this print statement is outside the loop so it will execute


	}

}
