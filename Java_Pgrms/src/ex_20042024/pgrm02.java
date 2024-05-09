package ex_20042024;

public class pgrm02 {

	public static void main(String[] args) {
		
		String s1 = "Pramod";
        String s2 = s1;
        System.out.println(s2);

        System.out.println( " --- ");

        String s3 = "TheTestingAcademy";
        s3.toLowerCase();
        System.out.println(s3);

        System.out.println( " --- ");

//reassign the value to variable
        
        s3 = s3.toLowerCase();
        System.out.println(s3);


	}

}
