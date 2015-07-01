import java.util.Scanner;
import java.util.Locale;

public class RudeQuestions
{
	public static void main ( String [] args )
	{
		String name;
		int age;
		double weight, income;
		
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH); 
		
		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's not old at all. " );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();
		
		System.out.print( "! Better keep that quiet. Finally, what's your income? " );
		income = keyboard.nextDouble();
		
		System.out.println( "Hopefully that is " + income + " per hour and not per year!" );
		System.out.println( "Well, thanks for answering my rude questions, " + name + "." );
	}
}