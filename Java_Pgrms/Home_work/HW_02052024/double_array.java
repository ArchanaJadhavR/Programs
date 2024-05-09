package HW_02052024;


//Create a Program to double an array and store it also. {1,2,3} -> {2,4,6}

public class double_array {

	public static void main(String[] args)
	{
		int num[] = {1,2,3};
		
        int num1[] = new int[num.length];

	
       for(int i = 0; i<num.length; i++)
		 {
			System.out.println("Original Array: " + num[i]);
			
			num1[i] = num[i] * 2;
			
		   System.out.println("Doubled Array: " + num1[i]);
				

			}


System.out.println("============== OR ==============");	
			
			
			 
			 for(int i = 0; i<num.length; i++)
		 {
			System.out.println("Original Array: " + num[i]);
			 
            num1[i] = num[i] * 2; 
		  }
		
System.out.println(".................");


       
        for (int j = 0; j<num.length; j++)
        {

		System.out.println("Doubled Array: " + num1[j]);

        }
		
		 }
	}


