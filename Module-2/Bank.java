
public abstract class Bank
{	
   abstract int gateRateOfInterest();
}
class HDFC extends Bank
{

	@Override
	int gateRateOfInterest() 
	{
		// TODO Auto-generated method stub
		return 10;
	}
	
}
class ICICI extends Bank
{

	@Override
	int gateRateOfInterest() 
	{
		// TODO Auto-generated method stub
		return 7;
	}
	
}
