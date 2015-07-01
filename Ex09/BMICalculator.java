import java.util.Scanner;
import java.util.Locale;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in).useLocale(Locale.ENGLISH);
		
		double m, kg, bmi;
		
		System.out.print( "Your height in m: " );
		m = keyboard.nextDouble();
		
		System.out.print( "Your weight in kg: " );
		kg = keyboard.nextDouble();
		
		bmi = kg / (m*m);
		
		System.out.println( "Your BMI is " + bmi );
	
	}
}