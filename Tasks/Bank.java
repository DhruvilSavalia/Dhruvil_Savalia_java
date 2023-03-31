import java.util.Scanner;

public class Bank 
{
	public static void main(String[] args) 
	{
		Bank b = new Bank();
		
		CheckingAccount ca = new CheckingAccount(101);
		
		ca.deposit(2000);
		
		System.out.println("Enter your Withdrawal amount");
		Scanner sc = new Scanner(System.in);
		
		
		try 
		{
			int data = sc.nextInt();
			ca.withdrawal(data);
			System.out.println("Your Remaining balance is = "+ca.getBalance());
			
		}
		catch(InsufficientFundException e)
		{
			System.out.println("You have not sufficient balance.you need more "+e.getAmount());
			System.out.println("Your balance is ="+ca.getBalance());
		}
		
	}

}
