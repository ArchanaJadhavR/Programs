package HW_20042024;

public class ex_02 {

	public static void main(String[] args) {
		
		int b = 10;
        System.out.println(--b + b++ + ++b);
        //  Part ->  A -> --b , Exp1 = 9 , a = 9
        //  Part ->  B -> b++ , Exp2 = 9 , a = 10
        //  Part ->  C -> ++b, Exp3 = 11 , a = 12

        // op ->  exp1+ exp2+exp3
        // a ? = 13
        System.out.println(b);


	}

}
