import java.util.Scanner;

public class Ex36 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter the First number:");
			int no1 = sc.nextInt();
			
			System.out.println("Enter the Second number:");
			int no2 = sc.nextInt();
			
			int division = no1/no2;
			System.out.println(division);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		
	}

}
