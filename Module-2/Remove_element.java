import java.util.ArrayList;

public class Remove_element 
{
	public static void main(String[] args) 
	{
		ArrayList<String>arrayList = new ArrayList<>();
		arrayList.add("java");
		arrayList.add("php");
		arrayList.add("python");
		arrayList.add("Android");
		arrayList.add("ios");
		
		System.out.println("List"+arrayList);
		
		arrayList.remove(2);
		arrayList.remove("python");
		
		System.out.println("After removing List is :"+arrayList);
		
		
	}

}
