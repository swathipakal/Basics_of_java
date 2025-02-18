package assignment;

public class global_variabkes {
	
	static int a=10;
	static int b=30;
	
	 static void static_increment()
	{
		System.out.println("Updated value of a is " +(++a));
	  	
	}
	 
	 void nonsatic_increment()
	 {
		 
		 System.out.println("Updated value of b " +(++b));
	 }
	
	public static void main(String[] args) {
		
		static_increment();
		global_variabkes var=new global_variabkes();
		  var.nonsatic_increment();
	}

}
