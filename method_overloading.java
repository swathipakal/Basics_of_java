package assignment;

public class method_overloading

{
	static void add()
	{
	int a=10;
	int b=20;
	System.out.println("The result is:"+(a+b));
	}
	
	void add(int a,int b)
	{
		;
		System.out.println("The result is:" +(a+b));
	}
	
	
	public static void main(String[] args) {
		
		add();
		method_overloading var=new method_overloading();
		var.add(50,13);
		
	}

}
