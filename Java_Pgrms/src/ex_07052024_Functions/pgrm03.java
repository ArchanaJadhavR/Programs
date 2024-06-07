package ex_07052024_Functions;

public class pgrm03 {
    public static void main(String[] args) {
        // Function which will say Hi
        for (int i = 0; i < 100; i++) { // 100
            sayHi();
            sayBye();
            rama();
        }
    }

    static void rama() {
        System.out.println("rama");
    }

    static void sayBye() {
        System.out.println("Bye");
    }

    static void sayHi() {
        System.out.println("Hello Hi");
    }

}
