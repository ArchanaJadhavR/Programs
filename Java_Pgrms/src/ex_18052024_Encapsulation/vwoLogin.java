package ex_18052024_Encapsulation;

public class vwoLogin 
{
	   private String username;
	    private String password;

	    // Constructor to initialize username and password
	    public vwoLogin(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    // Getter method for username
	    public String getUsername() {
	        return username;
	    }
	    
	    // Getter method for password
	    public String getPassword()
	    {
	        return password;
	    }
	     
	    
	    

	    public static void main(String[] args) {
	        // Creating an instance of vwoLogin
	        vwoLogin V = new vwoLogin("Admin", "Admin@123");
	        
	        System.out.println("Password: " + V.password);

	        V.password = "123";
	        
	        // Using getter methods to access private fields
	        System.out.println("Username: " + V.username);
	        System.out.println("new Password: " + V.password);
	    
	        
	        //within the class we can change the login deatils.
	        //outside the class we can't because we r using private .
	    
	    }
	    
}
