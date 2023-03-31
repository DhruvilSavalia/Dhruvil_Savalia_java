
public class CheckingAccount 
{
	int accno;
	double balance;
	
	public CheckingAccount(int accno)
	{
		this.accno=accno;
	}
	public void deposit(double amount)
	{
		this.balance=amount;
	}
	public void withdrawal(double amount) throws InsufficientFundException
	{
		if(amount<=balance)
		{
			balance = balance - amount;
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundException(needs);
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance= balance;
	}

}
