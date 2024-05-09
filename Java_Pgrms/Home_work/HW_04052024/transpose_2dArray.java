package HW_04052024;

/* Write a Java method to transpose a given 2D array.
{

{1,4,7} ,

{2,5,8} ,

{3,6,9}

*/

public class transpose_2dArray {

	public static void main(String[] args) 
	
	{
		int arr[][] = { {1,4,7} ,

                        {2,5,8} ,

                        {3,6,9}
		             };
		

        //int row = arr.length;
       // int clmn = arr.length;

        // Creating a new array to store the transposed elements
        int[][] arr2 = new int[3][3];

        // Transposing the array
        
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) 
            {
            	
                System.out.print(arr[i][j] + " ");
         
            
                arr2[j][i] = arr[i][j]; // transposing array
                
                
                
            }
            

          System.out.println();
        }

        // Printing the transposed array
        System.out.println("Transposed array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) 
            
            {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

}

		
	/* using built in function 
	 	
		 int[][] transposeArr = new int[3][3];
		
	for(int i=0; i<arr.length; i++)
	{
		for (int j=0; j<arr[i].length; j++)
		
		{
			
	
			
			transposeArr[i][j] =arr[j][i];
				
			System.out.println(transposeArr[i][j]);
	
	 */


