import java.util.ArrayList;

public class Update_Element 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer>arrayList = new ArrayList<Integer>();
		
		arrayList.add(22);
		arrayList.add(33);
		arrayList.add(44);
		arrayList.add(55);
		arrayList.add(66);
		
		System.out.println("List before Update :"+arrayList);
		
		int inexE = arrayList.indexOf(44);
		
		arrayList.set(inexE, 888);
		System.out.println("\n ArrayList after Update :" +arrayList);
		
	}

}
