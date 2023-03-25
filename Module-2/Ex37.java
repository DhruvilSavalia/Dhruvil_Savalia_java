import java.util.Scanner;

public class Ex37 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		
		if(age<18)
		{
			throw new ArithmeticException("Not valid");
		}
		else
		{
			System.out.println("Welcome to Vote");
		}
		
	}

}
