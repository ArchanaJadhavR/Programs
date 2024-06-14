package ex_14052024_Constructor;

public class Subject 

{
	String Sub_name;
	int Sub_marks;
	char Sub_grade;
	
	Subject(String N, int M, char G)
	{
		Sub_name = N;
		Sub_marks = M;
		Sub_grade = G;
				
	}
	
	
	public static void main(String[] args)
	{
		Subject S1 = new Subject("english", 70, 'B');
		
		Subject S2 = new Subject("Hindi", 80, 'B');
		
		Subject S3 = new Subject("Kannada", 90, 'A');
		  
		System.out.print (S1.Sub_name);
		System.out.print ("," +S1.Sub_marks);
		System.out.print ("," +S1.Sub_grade);
		
		System.out.println (" ");
		
		
		System.out.print (S2.Sub_name);
		System.out.print ("," +S2.Sub_marks);
		System.out.print ("," +S2.Sub_grade);
		
		System.out.println  (" ");
		
		System.out.print (S3.Sub_name);
		System.out.print ("," +S3.Sub_marks);
		System.out.print ("," +S3.Sub_grade);
		
		
		
		
		
	}

}
