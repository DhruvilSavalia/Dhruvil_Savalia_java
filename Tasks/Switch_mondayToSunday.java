package Javaprograms;
import java.util.Scanner;
public class Switch_mondayToSunday 
{
	public static void main(String[]args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1)Sunday 2)Monday 3)Tuesday 4)Wednesday 5)Thursday 6)Friday 7)Saturday");
		System.out.println("Enter the number to see a day:");
		int number = sc.nextInt();
		
		switch(number)
		{
		  case 1:
			System.out.println("Sunday");
			break;
		  case 2:
			System.out.println("Monday");
			break;
		  case 3:
			System.out.println("Tuesday");
			break;
		  case 4:
			System.out.println("Wednesday");
			break;
		  case 5:
			System.out.println("Thursday");
			break;
		  case 6:
			System.out.println("Friday");
			break;
		  case 7:
			System.out.println("Saturday");
			break;
			default:
				System.out.println("Enter valid choice:");
			
		}
	}
}
