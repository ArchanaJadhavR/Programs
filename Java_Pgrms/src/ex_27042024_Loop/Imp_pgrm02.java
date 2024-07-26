package ex_27042024_Loop;

public class Imp_pgrm02 {

	public static void main(String[] args)
	
	{
	
		for (int i=0; i<=10; i++)
		{
		
		
			if (i%2 == 0 && i != 0) // 			if (i%2 == 0) -> start for(int i=1; i<=10; i++)
			
			{
				System.out.println("even num :" + i);
				
				continue;
			}
			
		
			System.out.println ("odd num :" + i);
		
		

	}
	
}

}