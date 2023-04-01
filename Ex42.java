
class Sender
{
	
	public void Send(String msg)
	{
		System.out.println("Sending "+msg);
		
		
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(msg+"sent");
	}
}
class Threadsend extends Thread
{
	Sender sender;
	String msg;
	
	 Threadsend(Sender sender,String msg)
	{
		this.sender = sender;
		this.msg = msg;
		
	}
	public void run ()
	{
		synchronized (sender)
		{
			sender.Send(msg);
		}
	}
}

public class Ex42 
{
  public static void main(String[] args) 
  {
	  Sender s = new Sender();
	  Threadsend t1 = new Threadsend(s,"Welcome");
	  t1.start();
	
  }
}
