import java.util.Scanner;

public class Count_digits 
{
    public static void main(String[] args) 
    {
		 int n,count=0;
		System.out.println("Enter any number:");
		Scanner r = new Scanner(System.in);
		n=r.nextInt();
		
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		System.out.println("Number of digits:"+count);
	}
}
