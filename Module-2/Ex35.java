
public class Ex35 
{
	public static void main(String[] args) 
	{
		try
		{
			try
			{
				int no = 10/0;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			try
			{
				int a [] = new int[5];
				a[5]=20/0;
			}
			catch(ArrayIndexOutOfBoundsException e1)
			{
				System.out.println(e1);
			}
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		
	}

}
