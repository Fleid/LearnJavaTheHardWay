import java.util.Scanner;
import java.util.Locale;

public class AgeMessages
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		int age;
		
		System.out.print( "How old are you? ");
		age = keyboard.nextInt();
		
		if ( age < 18 )
			{
				System.out.println( "You are too young to get a tattoo. ");
			}
		if (age < 35 )
			{
				System.out.println( "You are too young to run for President of the USA. ");
			}
	}
}