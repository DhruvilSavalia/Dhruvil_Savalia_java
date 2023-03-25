
class daemonthread extends Thread
{
	public void run()
	{
		System.out.println("demon thread "+Thread.currentThread().isDaemon());
		System.out.println("thread" +Thread.currentThread().isAlive());
	}
}

public class Ex44 
{
  public static void main(String[] args) 
  {
	  daemonthread t1 = new daemonthread();
	  daemonthread t2 = new daemonthread();
	  
	  t1.setDaemon(true);
	  t1.start();
	  t2.start();
	
}	

}
