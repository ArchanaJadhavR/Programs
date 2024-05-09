package ex_18042024;

public class explicit {

	public static void main(String[] args) {
		

        int a1 = 300;
        byte b1 = (byte)a1; // Explicit Casting
        System.out.println(b1);

        // 300 -> 32 Bits  00000000000000 0 1 0 1 1 0 0-> here only last 8 bits
        //->are getting stored into byte rest r ignored 
        // byte - 8 bits
        // // 0 0 1 0 1 1 0 0
        // 44


	}

}
