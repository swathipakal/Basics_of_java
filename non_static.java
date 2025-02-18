package assignment;

public class non_static {
    void substraction()
    {
    	int a=50;
    	int b=12;
    	int d=a-b;
    	System.out.println("The result is :"+d);
    	
    	
    }
	
	
	public static void main(String[] args)
	{
		non_static v=new non_static();
		v.substraction();
	}
}
