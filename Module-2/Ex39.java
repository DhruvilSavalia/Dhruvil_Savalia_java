import java.util.Scanner;

public class Ex39 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Age :");
			int age = sc.nextInt();
			String[] arg = null;
			age = Integer.parseInt(arg[0]);
			
			if(age<18)
			{
				throw new ArithmeticException("Invalid Age Exception");
				
			}
			else
			{
				System.out.println("Welcome to Vote");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
	}

}
