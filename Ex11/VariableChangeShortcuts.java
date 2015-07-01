public class VariableChangeShortcuts
{
	public static void main( String[] args )
	{
		int i = 5, j = 5, k = 5;
		
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		i += 3;
		j -= 3;
		k *= 3;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		System.out.println();
		
		i = j = k = 5;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		i =+ 1; // i devient +1, juste mal écrit
		j =- 2; // j devient -2, juste mal écrit
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		System.out.println();
		
		i = j = k = 5;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		i++;
		j--;
		System.out.println( "i: " + i + "\tj: " + j + "\tk: " + k );
		System.out.println();				
		
		
	}
}