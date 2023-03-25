
abstract class Bank
{
	public abstract void getBalance();
}
class BankA extends Bank
{

	@Override
	public void getBalance() 
	{
		
		// TODO Auto-generated method stub
		System.out.println("Deposit of A : $100");
	}
	
}
class BankB extends Bank
{

	@Override
	public void getBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("Deposit of B : $150");
		
	}
	
}
class BankC extends Bank
{

	@Override
	public void getBalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("Deposit of C : $200");
		
	}
	
}
public class Ex38 
{
  public static void main(String[] args) 
  {
	  Bank ba = new BankA();
	  Bank bb = new BankB();
	  Bank bc = new BankC();
	  
	  ba.getBalance();
	  bb.getBalance();
	  bc.getBalance();
	  
	
  }	

}
