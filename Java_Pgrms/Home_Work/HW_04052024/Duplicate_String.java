package HW_04052024;

//Duplicate String - Hello World -> Helowrd

public class Duplicate_String {

	public static void main(String[] args) 
	{
		
		String s1 = "Hello world";
		String Duplicate = " ";
		
		
		//char[] arr = s1.toCharArray();
	
		
		
		for(int i = 0; i<s1.length(); i++)
			
						
		{
			char ch = s1.charAt(i);
			

			//if(s1==ch) 
					
					{
				       
				Duplicate = s1;
					}
			
			
		}

		System.out.println(Duplicate);
	
		

        
	}
	}


