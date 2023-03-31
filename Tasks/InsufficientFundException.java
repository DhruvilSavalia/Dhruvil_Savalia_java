
public class InsufficientFundException extends Exception
{
	double amount;
	
	public double getAmount()
	{
		return amount;
	}
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	InsufficientFundException(double amount)
	{
		this.amount=amount;
	}
	

}
