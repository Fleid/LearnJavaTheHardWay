import java.util.Scanner;
import java.util.Locale;

public class ShallowGrandmother
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		int age;
		double income, attractiveness;
		boolean allowed;
		
		System.out.print( "Enter your age: " );
		age = keyboard.nextInt();
		
		System.out.print( "Enter your yearly income: ");
		income = keyboard.nextDouble();
		
		System.out.print( "How attractive are you, on a scale from 0.0 to 10.0? ");
		attractiveness = keyboard.nextDouble();
		
		allowed = ( age > 25 && age < 40 && (income > 50000 || attractiveness >= 8.5 ));
		
		System.out.println( "You are allowed to date my grandchild: " + allowed );
	}
}