package assignment;

public class constructor_overloading {
	
	
     constructor_overloading()
	{
		
		System.out.println("Hello World");
	}
	
     constructor_overloading(int a,int b)
	{
		System.out.println("sum is:"+(a+b));
		
	}
	
	public static void main(String[] args)
	{
		
		new constructor_overloading();		
		new constructor_overloading(47,33);
	}
	

}
