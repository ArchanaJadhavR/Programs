package ex_11052024_Objectclass;

public class pgrm04 {
    public static void main(String[] args) {

        car tesla = new car();
        tesla.name = "Tesla";
        tesla.model = "Model 3";

        tesla.reverse();
        tesla.speedTop();

        car volvo = new car();
        volvo.name = "Volvo";
        volvo.model = "XC90";

       volvo.reverse();
       volvo.speedTop();



    }
}
