package ex_25042024_Switch;


	
	import java.util.Scanner;

	public class aa
	
	{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a character, and I will tell you if it is a vowel or not:");
	        char user_input = sc.next().toLowerCase().charAt(4);

	        switch (user_input) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println("Vowel");
	                break;
	            default:
	                System.out.println("Not a Vowel, It is Consonant");
	        }

	        sc.close();
	    }
	}

