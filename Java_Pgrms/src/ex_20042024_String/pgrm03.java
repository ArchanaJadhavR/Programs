package ex_20042024_String;

public class pgrm03 {

	public static void main(String[] args) {
		


        String name = "The Testing Academy";
        String name1 = "The Testing Academy";
//here we have same value so only one string will be created in JVM
        
        String name2  = new String("The Testing Academy"); // Heap Area(OA)
 //here created new area in JVM
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        
	}

}
