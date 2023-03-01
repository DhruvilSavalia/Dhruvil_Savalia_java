package javaprograms;

abstract class bank
{
	public abstract void getbalance();
	
}
class bankA extends bank
{

	@Override
	public void getbalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("$100");
	}
	
	
}
class bankB extends bank
{

	@Override
	public void getbalance() 
	{
		// TODO Auto-generated method stub
	   System.out.println("$150");	
	}
	
}
class bankC extends bank
{

	@Override
	public void getbalance() 
	{
		// TODO Auto-generated method stub
		System.out.println("$200");
		
	}
	
}

public class Ex28 
{
  public static void main(String[] args) 
  {
	  bankA b1 = new bankA();
	  b1.getbalance();
	  
	  bankB b2 = new bankB();
	  b2.getbalance();
	  
	  bankC b3 = new bankC();
	  b3.getbalance();
	  
	  
  }	

}
