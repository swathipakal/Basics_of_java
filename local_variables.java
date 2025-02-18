package assignment;

public class local_variables {
	
	static void increment_local()
	{
	  int a=12;
	  System.out.println("Upadatedd value of a is "+(++a));
	  	
	}
	
	void increment_nonstatic()
	{
		int b=30;
		System.out.println("Updated value of b is " +(++b));	
	}
	
  public static void main(String[] args) {
	
	  
	  increment_local();
	  local_variables var=new local_variables();
	  var.increment_nonstatic();
}
}
