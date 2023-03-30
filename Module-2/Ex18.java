import java.util.HashSet;
import java.util.Set;

public class Ex18 
{

	public static void allInterLeavings(String res, String P, String Q, Set <String>out) 
	{
		if(P.length()==0 && Q.length()==0)
		{
			out.add(res);
			return;
		}
		if(P.length()>0)
		{
			allInterLeavings(res + P.charAt(0), P.substring(1), Q, out);
			
		}
		if(Q.length()>0)
		{
			allInterLeavings(res + Q.charAt(0), P, Q.substring(1), out);
		}
	}
	public static void main(String[] args) 
	{
		String P = "WX";
		String Q = "YZ";
		System.out.println("The given strings are :"+ P +"  "+ Q);
		System.out.println("The Interleavings strings are : ");
		Set < String > out = new HashSet < > ();
		allInterLeavings("", P, Q, out);
		
		out.stream().forEach(System.out::println);
		
	}
	

}
