package javaprograms;

	class member
	{
		int age , mobileno;
		String name , address;
		int salary;
		
		void salary()
		{
			System.out.println(salary);
		}
		
	}
	class function extends member
	{
		function(String name , String address , int age , int mobile , int salary)
		{
			this.name = name;
			this.address = address;
			this.age = age;
			this.mobileno = mobileno;
			this.salary = salary;
		}
	}
	public class Ex23
	{
		public static void main(String[] args) 
		{
			function f = new function("Dhruvil","Rajkot",19, 397191 ,2500000);
			
			f.salary();
			
			
		}

}
	
	
