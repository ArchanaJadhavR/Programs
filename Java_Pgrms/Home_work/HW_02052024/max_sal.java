package HW_02052024;

//		Find the max salary in the input arrays {30,50,60,90,10, 100,999}

public class max_sal {

	public static void main(String[] args)
	
	{
		int sal[] = {30,50,60,90,10, 100,999};
        int max = sal [0];

		for(int i=0; i<sal.length;   i++)
			
		{
			if (sal[i] > max)
			
			{             
				max = sal[i];

            }
		
		
		}
		System.out.println("Maximum sal in the array: " + max);	
	}
}
		



