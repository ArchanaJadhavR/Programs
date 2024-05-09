package HW_04052024;

/* 2d Coding Arrays Question


int[][] arr = {

{1, 2, 3},

{4, 5, 6},

{7, 8, 9}

};


Write - Java method to find the maximum value in a 2D array. - O/P - 9
*/

public class max_value_2dArray {

	public static void main(String[] args) 
	 {
		
		int[][] arr = {

				{1, 2, 3},

				{4, 5, 6},

				{7, 8, 9}

				};
		
		int max = arr [0][0];
		
		//int max = Integer.MIN_VALUE;

		for (int i=0; i<arr.length; i++)
		
		{
			
	for (int j = 0; j < arr[i].length; j++)
		
			
		{		
			
				if(arr[i][j]>max)
					max = arr[i][j];
				
				}
				}
	System.out.println(max);
	
		
	 }

		
	 }































