package javaprograms;

public class Ex20 
{
	public static void main(String[] args) 
	{
		Ex20 e = new Ex20();
		e.print('a',10);
		e.print(10, 'a');
		
	}

	 void print(int n, char c) 
	{
		// TODO Auto-generated method stub
		System.out.println("integer is :"+n+"\t"+"character is :"+c);
		
	}
	void print(char c,int n)
	{
		System.out.println("character is :"+c+"\t"+"integer is :"+n);
	}

}
