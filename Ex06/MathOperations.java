public class MathOperations
{
	public static void main( String[] args )
	{
		int a, b, c, d, e, f, g;
		double x, y, z;
		String one, two, both;
		
		a = 10;
		b = 27;
		System.out.println( "a is " + a + ", b is " + b );
		
		c = a + b;
		System.out.println( "a+b is " + c );
		d = a - b;
		System.out.println( "a-b is " + d );
		g = b % 10;
		System.out.println( "b%10 is " + g );
		
		x = 1.1;
		System.out.println( "x is " + x );
		
		y = x * x;
		System.out.println( "x*x is " + y );
		
		z = b / 2;
		System.out.println( "b/2 is " + z );

		z = b / 2.0;
		System.out.println( "b/2.0 is " + z );
		
		one = "dog";
		two = "house";
		both = one + two;
		System.out.println( both );
	}
}