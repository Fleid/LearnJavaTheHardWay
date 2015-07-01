import java.util.Scanner;
import java.util.Locale;

public class BooleanExpressions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		boolean a, b, c, d, e, f;
		double x, y;
		
		System.out.pint( "Give me two numbers. First: " );
		x = keyboard.nextDouble();
		System.out.print( "Second: " );
		y = keyboard.nextDouble();
		
		a = (x <  y);
		b = (x <= y);
		c = (x == y);
		d = (x != y);
		e = (x >  y);
		f = (x >= y);
		
		System.out.println( x + " is LESS THAN " + y + ": " + a );
		System.out.println( x + " is LESS THAN or EQUAL TO " + y + ": " + b );
		System.out.println( x + " is EQUAL TO " + y + ": " + c );
		System.out.println( x + " is NOT EQUAL TO " + y + ": " + d );
		System.out.println( x + " is GREATER THAN " + y + ": " + e );
		System.out.println( x + " is GREATHER THAN or EQUAL TO " + y + ": " + f );
		System.out.println();
	}
}