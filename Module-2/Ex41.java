
class c implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("A"+i);
		}
		
	}
	
}
class b implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int j=0;j<=10;j++)
		{
			System.out.println("B"+j);
		}
		
	}
	
}

public class Ex41 
{
  public static void main(String[] args) 
  {
	  Thread t = new Thread(new c());
	  Thread t3 = new Thread(new b());
	  
	  t.start();
	  t3.start();
	
  }
}
