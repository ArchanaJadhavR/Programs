package ex_18042024;

public class IQ04 {

	public static void main(String[] args) {
		

        // OR gate
        int a = 12;
        boolean b = !(a > 10 || a < 5);
        // boolean b = !(true or false) -> in OR gate true / false = true
        //boolean b = !(true); -> reverse of true because of using !.
        //boolean b = false.
        System.out.println(b);

        //AND gate
        
        int a1 = 12;
        boolean b1 = !(a1 > 10 && a1 < 5);
        // boolean b = !(true or false) -> in AND gate true / false = false
        //boolean b = !(false); -> reverse of false because of using !.
        //boolean b = false.
        System.out.println(b1);

        int a3 = 90;
        int b3 = 90;
        boolean c = (a3 <= b3);
        System.out.println(c);

	}

}
