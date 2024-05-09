package HW_04052024;


//Write a Java method to check if a given element exists in a 2D array.
//( element =8) , true


public class check_elemnet {

	public static void main(String[] args) {
		
		int[][] arr = {

				{1, 2, 3},

				{4, 5, 6},

				{7, 8, 9}

				};

	
		int value = 8;
		
		boolean element = false;
		
		for(int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				
			{
				if(arr[i][j] == value)
				
                		element = true; 
			}
			
			
			
	       	}
		
		System.out.println("Given element exists in a 2D array :" + element);
		
		System.out.println("the value is :" + value);
		
	}
	

}



