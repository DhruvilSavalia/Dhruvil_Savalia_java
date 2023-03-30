import java.util.Scanner;

public class sum_avg 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter the five numbers :");
		for(int i=1;i<=5;i++)
		{
			int no = sc.nextInt();
			sum +=no;
			
		}
		System.out.println("Sum of five number = "+sum);
		System.out.println("Average of five numbers = "+sum/5);
		
	}

}
