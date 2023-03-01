package javaprograms;

public class Ex15 
{
	public static void main(String[] args) 
	{
		String s1 = "topsint.com";
		String s2 = "Topsint.com";
		String s3 = "topsint.com";
		
		System.out.println(s1 + " and " + s3 +" : "+s1.contains(s3));
		System.out.println(s1 + "  and " + s2 + " : "+s1.contains(s2));
		
	}

}
