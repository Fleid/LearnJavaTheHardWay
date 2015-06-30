public class CreatingVariables
{
	public static void main( String[] args)
	{
		// Declare variables
		int x, y, age;
		double seconds, e, checking;
		String firstName, last_name, title;
		
		// Initialize variables
		x = 10;
		y = 400;
		age = 35;
		
		seconds = 4.71;
		e = 2.718288182845904523536;
		checking = 1.89;
		
		firstName = "Graham";
		last_name = "Mitchell";
		title = "Mr.";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment completed in " + seconds + " seconds." );
		System.out.println( "My favorite irrational number is Euler's constant: " + e );
		System.out.println( "Hopefully your balance is more than $" + checking + "!" );
		System.out.println( "My full name is " + title + " " + firstName + " " + last_name );
	}
}
