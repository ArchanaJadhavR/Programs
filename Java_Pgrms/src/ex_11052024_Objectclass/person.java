package ex_11052024_Objectclass;

public class person {

    // Attribute
    String name;
    byte age;
    long phone_no;
    String[] address;
    double height;
    boolean isMale;
    float salary;
    String dob;
    String eye_color;


    // Behav / Functionality
    void walk()
    {
        System.out.println("I can walk");
    }
    void talk(String msg){
        System.out.println("I will say ->"+ msg);
    }
    String sleep(){
        return "Sleeing";
    }
    String eat(String item){
        return item;
    }
}
