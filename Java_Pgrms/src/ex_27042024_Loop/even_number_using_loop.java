package ex_27042024_Loop;

public class even_number_using_loop {

	//print even number using loop from 1 to 50
	
	public static void main(String[] args) 
	{
		for(int i=1; i<=50; i++)
		
		{
		if(i % 2 == 0)
		
// 	if(i % 3 == 0 && i <= 30) -> to print 3 table
//		 	if(i % 2 == 0 && i <= 20) -> to print  table
			
			System.out.println("even number : " + i);
		}
		
	}

}
