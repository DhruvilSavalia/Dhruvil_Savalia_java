package javaprograms;

public class Ex19 
{
	static int ch = 256;
	static char character(String s1)
	{
		int[] a = new int[ch];
		int i;
		
		for(i=0;i<=s1.length();i++)
			(a[s1.charAt(i)])++;
		{
			int ch_first = 0, ch_second = 0;
			for(i=0;i<ch;i++)
			{
				if(a[i]>a[ch_first])
				{
					ch_second = ch_first;
					ch_first = i;
					
				}
				else if(a[i]>a[ch_second] && a[i]!=a[ch_first])
					ch_second=i;
			}
			return (char) ch_second;
		}
	
	}
	public static void main(String[] args) 
	{
		String s1 = "success";
		System.out.println("The given String is :"+s1);
		char b = character(s1);
		if(b!=0)
		{
			System.out.println("The second most frequent  character is :"+b);
			
		}
		else
		{
			System.out.println("error");
		}
		
	}

}
