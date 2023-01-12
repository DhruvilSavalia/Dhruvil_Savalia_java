
public class AbstractClassTest 
{
	public static void main(String[] args) 
	{
		Bank bankref = new HDFC();
		System.out.println("HDFC Bank :"+bankref.gateRateOfInterest());
		
		bankref = new ICICI();
		{
			System.out.println("ICICI Bank :"+bankref.gateRateOfInterest());
		}
		
	}

}
