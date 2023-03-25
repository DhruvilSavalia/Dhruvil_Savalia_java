import java.util.Scanner;

public class Ex33 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter any two numbers:");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		
		int division = no1/no2;
		System.out.println(division);
	}

}
