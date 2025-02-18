package assignment;

public class constructor_class 
{
     constructor_class()
    {
    	System.out.println("welcome to constructor class");
    }
    
     constructor_class(int a,int b)
    {
      int sum;
      sum=a+b;
      System.out.println("The result is:" +sum);
    	
    }
     
     constructor_class(double a,int b)
     {
       double sum;
       sum=a+b;
       System.out.println("The result is:" +sum);
     	
     }
    
    public static void main(String[] args) 
    
    {
    	
    	new constructor_class();
    	new constructor_class(10,20);
    	new constructor_class(44.56,20);
		
	}
    
	
}
