import java.util.Scanner;
import java.util.Locale;

public class WeaselOrNot
{
	public static void main( String [] args )
	{
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		String word;
		boolean yep, nope;
		
		System.out.println( "Type the word \"weasel\" please." );
		word = keyboard.next();
		
		yep =   word.equals("weasel");
		nope = ! "weasel".equals(word);
		
		System.out.println( "You typed what was requested: " + yep );
		System.out.println( "You ignorde the instructions: " + nope );
	}
}