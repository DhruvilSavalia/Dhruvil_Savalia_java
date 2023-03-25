
class a implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread a"+i);
		}
		
	}
	
}

public class Ex40 
{
  public static void main(String[] args) 
  {
	  Thread t1 = new Thread(new a());
	  t1.start();
	
  }	

}
