package HW_23042024;

import java.util.Scanner;

//prgm to check a vowel or a consonant

public class pgrm03 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character");
		
		char ch = sc.next().charAt(0);
		
	
        // Check if the character is a vowel or a consonant

		
		if (isVowel (ch))
		{
			System.out.println("it is a Vowel");
		}
		
		else
			
		{
			System.out.println("it is a Consonant");
		}
			
		sc.close();
		
	}

	 // Function to check if a character is a vowel

	private static boolean isVowel(char ch) {

		ch = Character.toLowerCase(ch); // Convert to lower case to handle both upper and lower case
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
