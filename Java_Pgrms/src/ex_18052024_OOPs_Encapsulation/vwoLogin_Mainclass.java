package ex_18052024_OOPs_Encapsulation;

public class vwoLogin_Mainclass 
{

    public static void main(String[] args) {
        // Creating an instance of vwoLogin
        vwoLogin V = new vwoLogin("Admin", "Admin@123");

       
        //V.username = "123"; -> can't change password here because it is private.
	       
        // Using getter methods to access private fields
        System.out.println("Username: " + V.getUsername());
        System.out.println("Password: " + V.getPassword());

}
}