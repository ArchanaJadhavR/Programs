package ex_16052024_OOPs_Inheritance;

public class GrandfatherClass_multilevel {

	public static void main(String[] args)
	{
	     CHILD C = new CHILD();
	      C.home();
	      C.home1();
	      C.home2();
	      
	      Grandfather_multilevel G = new CHILD(); //dynamic dispatch
	         G.home(); 
	// CHILD B = new Grandfather_multilevel(); -->can't do it
	
	
	}
	

}
