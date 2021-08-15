

class Maximum 
{
  	
	//Refactor 1 and Refactor 2
	public static <T extends Comparable<T>> void testMaximum(T x, T y, T z) 
	{
		T max = x;

		if (y.compareTo(max) > 0)
		max = y; 

		if (z.compareTo(max) > 0)
		max = z;

		printMax(x, y, z, max);
	}
			

	public static <T extends Comparable<T>> void printMax(T x, T y, T z, T max)
	{
		//UC 1 and UC 2 and UC 3
		System.out.printf("\nMaximum of "+x+ "," +y+ "," +z+ " is : " +max );

		
	}

} 

public class MainClass
{

	public static void main(String args[]) 
	{
		Maximum.testMaximum(2, 4, 6);

		Maximum.testMaximum(6.1, 4.1, 2.1);

		Maximum.testMaximum("Apple", "Peach", "Banana");
  	}
}