package ex_14052024_Constructor;

//optimized code
public class Subject1
{

		
			String Sub_name;
			int Sub_marks;
			char Sub_grade;
			
			Subject1(String N, int M, char G)
			{
				Sub_name = N;
				Sub_marks = M;
				Sub_grade = G;
						
			}
			
			void display()
			{
			 System.out.println (Sub_name +" ,"+ Sub_marks +" ,"+ Sub_grade);	
			}
			
			public static void main(String[] args)
			{
				Subject1 S1 = new Subject1("english", 70, 'B');
				
				Subject1 S2 = new Subject1("Hindi", 80, 'B');
				
				Subject1 S3 = new Subject1("Kannada", 90, 'A');
				  
				S1.display();
				S2.display();
				S3.display();
				
				
				
				
			}

		

	}


