import java.util.ArrayList;
import java.util.Iterator;

public class Iterate_arraylist 
{
	public static void main(String[] args) 
	{
		
		ArrayList<String> arraylist = new ArrayList<>();
		arraylist.add("one");
		arraylist.add("two");
		arraylist.add("three");
		arraylist.add("Four");
		arraylist.add("Five");
     
		Iterator i = arraylist.iterator();
		
		while(i.hasNext())
		{
		  System.out.println(i.next());	
		}
		
	}

}
