import java.util.Scanner;
import java.util.Locale;

public class ForgetfulMachine
{
	public static void main ( String [] args )
	{
		// Scanner keyboard = new Scanner(System.in) // Don't handle . as decimal separator but ,
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH); 
		
		System.out.println( "What city is the capital of France?" );
		keyboard.next();
		
		System.out.println( "What is 6 multiplied by 7?" );
		keyboard.nextInt();
		
		System.out.println( "What is your favorite number between 0.0 and 1.0?" );
		keyboard.nextDouble();
		
		System.out.println( "Is there anything else you would like to tell me?" );
		keyboard.next();
	}
}