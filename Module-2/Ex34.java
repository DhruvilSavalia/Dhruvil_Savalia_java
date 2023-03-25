
public class Ex34 
{
	public static void main(String[] args) 
	{
		try
		{
			int b[] = new int [5];
			b[5]=20/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("exception");
		}
		
	}

}
