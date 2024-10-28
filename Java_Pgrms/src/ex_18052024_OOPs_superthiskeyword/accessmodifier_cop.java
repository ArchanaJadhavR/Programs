package ex_18052024_OOPs_superthiskeyword;

public class accessmodifier_cop
{

	    public int gun; // public access by anyone
	    private String idCard; // Privat - only available to the cop

	    public accessmodifier_cop (int gun)
	    {
	        this.gun = gun; // PC
	    }
	    

	   public void canIShoot()  //access outside the pacakage
	   
	   {
	        System.out.println("Thief you shouldn't, Shoot!");
	    }

	   
	   protected void canIShoot2()//access outside the class within package

	   {
	        System.out.println("Jr cop so think befor you can, Shoot!");
	    }
	   
	   
	   
	   private void shoot() //accessd within class
		
	   {
	        System.out.println("Of-course Cop can, Shoot!");
	    }


    public static void main(String[] args) 
    {

	accessmodifier_cop C = new accessmodifier_cop(10);

    System.out.println("number of Guns: "+C.gun);
    C.shoot();
    
    
    }
}
